package com.wipro.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.model.Customer;

@Controller
@RequestMapping("/sales")
public class SalesController {

	@GetMapping
	public ModelAndView showSalesPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("sales");
		//get all customers from http://localhost:6001/customer
		RestTemplate rt=new RestTemplate();
		Customer[] customers=rt.getForEntity("http://localhost:6001/customer", Customer[].class).getBody();
		mv.addObject("customers", customers);
		return mv;
	}
	
	@GetMapping("/customer")	
	public ModelAndView findSalesByCustomer(Integer id)
	{
		//find customer object using id
		RestTemplate rt=new RestTemplate();
		Customer customer=rt.getForEntity("http://localhost:6001/customer/"+id, Customer.class).getBody();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("sales");
		//get all customers from http://localhost:6001/customer
		Customer[] customers=rt.getForEntity("http://localhost:6001/customer", Customer[].class).getBody();
		mv.addObject("customers", customers);
		mv.addObject("customer", customer);
		return mv;	
	}
}
