package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.model.Product;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	private CircuitBreakerFactory cbf;
	
	@GetMapping
	public ModelAndView home()
	{
		//we want to add List<Product> to the model
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		//where is list of product?
		//call the product-rest-api to get list of products
		RestTemplate rt=new RestTemplate();
		CircuitBreaker circuitBreaker = cbf.create("circuitbreaker");
		
		Product[] products=circuitBreaker.run(()->rt.getForEntity("http://localhost:6002/product", Product[].class).getBody(), throwable -> errorMethod());
//		Product[] products = rt.getForEntity("http://localhost:6002/product", Product[].class).getBody();
		mv.addObject("products",products);
		
		return mv;
	}
	
	public Product[] errorMethod()
	{
		Product [] temp=new Product[1];
		temp[0]=new Product(0,"Not available",0.0);
		return temp;
	}

}
