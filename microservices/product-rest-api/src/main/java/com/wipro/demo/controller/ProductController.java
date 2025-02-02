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

import com.wipro.demo.entity.Product;
import com.wipro.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return ps.create(product);
	}

	@GetMapping
	public List<Product> read() {
		return ps.read();
	}
	
	@GetMapping("/{id}")
	public Product read(@PathVariable("id") Integer id) {
		return ps.read(id);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return ps.update(product);
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id")Integer id) {
		return ps.delete(id);
	}
	
}
