package com.wipro.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.Food;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MyController {
	@GetMapping
	public String home()
	{
		return "Hi India";
	}
	
	@GetMapping("/food/{id}")
	public Mono<Food> getFood(@PathVariable("id") Integer id)
	{
		return Mono.just(new Food(id, "Briyani", 123, "Lunch"));
	}
	
	@GetMapping("/food")
	public Flux<Food> getFoods()
	{
		Food f1=new Food(1, "Briyani", 123, "Lunch");
		Food f6=new Food(2, "Paratta", 30, "Lunch");
		Food f5=new Food(3, "Roti", 25, "Dinner");
		Food f4=new Food(4, "Fried rice", 111, "Dinner");
		Food f3=new Food(5, "Pizza", 223, "Breakfast");
		Food f2=new Food(6, "Burger", 124, "Breakfast");
		
		return Flux.just(f1, f2, f3, f4, f5, f6);
	}
}
