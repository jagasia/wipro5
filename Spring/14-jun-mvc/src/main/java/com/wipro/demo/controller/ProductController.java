package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.entity.Product;
import com.wipro.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public ModelAndView showProductPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		mv.addObject("products",products);
		mv.addObject("product",new Product());
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addProduct(@ModelAttribute Product product)
	{
		System.out.println(product);
		ps.create(product);
		return showProductPage();
	}
	
	@PostMapping(value = "/dml", params = "update")
	public ModelAndView updateProduct(@ModelAttribute Product product)
	{
		System.out.println(product);
		ps.update(product);
		return showProductPage();
	}
	
	@PostMapping(value = "/dml", params = "delete")
	public ModelAndView deleteProduct(@ModelAttribute Product product)
	{
		System.out.println(product);
		ps.delete(product.getId());
		return showProductPage();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id") Integer id)
	{
		Product product = ps.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		mv.addObject("products",products);
		mv.addObject("product",product);
		return mv;		
	}
	
}
