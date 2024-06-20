package com.wipro.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.demo.model.Food;

@RestController
public class MyController {

	@GetMapping
	public String home()
	{
		//i am going to call a rest api from here (spring boot app)
		//every spring boot app, has RestTemplate (no need to add dependencies in pom.xml)
		//you may create an object of RestTemplate. Or you may autowire it
		//RestTemplate is used to access any rest api
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Food> result = rt.getForEntity("http://localhost:5000/food/1552", Food.class);
		Food food = result.getBody();
		
		return "Hello world: "+food;
	}
}
