package com.wipro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.wipro.demo.model.Food;

@RestController
public class MyController {

	@GetMapping
	public String home()
	{
		String result="";
		WebClient api = WebClient.create("http://localhost:5000");
		api.get()
		.uri("/food/1552")
		.retrieve()
		.bodyToMono(Food.class)
		.subscribe(System.out::println);
		
		
		return "Hello world...";
	}
}
