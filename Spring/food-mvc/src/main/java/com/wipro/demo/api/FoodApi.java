package com.wipro.demo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.demo.model.Food;

@FeignClient(name = "food-api", url = "http://localhost:5000/food")
public interface FoodApi {

	@PostMapping
	public Food addProduct(@RequestBody Food food);
	
	@GetMapping
	public List<Food> retrieveAllProducts();
	
	@GetMapping("/{id}")
	public Food findProductById(@PathVariable("id") Integer id);
	
	@PutMapping
	public Food updateProduct(@RequestBody Food food);
	
	@DeleteMapping("/{id}")
	public Food deleteProduct(@PathVariable("id") Integer id);
}
