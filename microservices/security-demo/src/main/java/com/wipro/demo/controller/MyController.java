package com.wipro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home()
	{
		return "Hello world";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "About us";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "Contact us";
	}
}
