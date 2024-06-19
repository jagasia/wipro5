package com.wipro.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dummy2Application {
	@Autowired
	private EmployeeWebClient client;
	
	@GetMapping
	public String get()
	{
		client.findProduct();
		return "check console";
	}
	public static void main(String[] args) {
		SpringApplication.run(Dummy2Application.class, args);
	}

}
