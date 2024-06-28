package com.wipro.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MyController {

	@GetMapping
	public String home()
	{
		return "Hello world";
	}
	
	
	
	//admin
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public String about()
	{
		return "About us";
	}
	
	//user
	@GetMapping("/contact")
	@PreAuthorize("hasAuthority('ROLE_USER')") 
	public String contact()
	{
		return "Contact us";
	}
}
