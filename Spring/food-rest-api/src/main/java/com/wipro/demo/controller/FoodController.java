package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.entity.Food;
import com.wipro.demo.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodService fs;
	
	@PostMapping
	public Food addProduct(@RequestBody Food food) {
		return fs.create(food);
	}
	
	@GetMapping
	public List<Food> retrieveAllProducts() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Food findProductById(@PathVariable("id") Integer id) {
		return fs.read(id);
	}
	
	@PutMapping
	public Food updateProduct(@RequestBody Food food) {
		return fs.update(food);
	}
	
	@DeleteMapping("/{id}")
	public Food deleteProduct(@PathVariable("id") Integer id) {
		return fs.delete(id);
	}
	
}
