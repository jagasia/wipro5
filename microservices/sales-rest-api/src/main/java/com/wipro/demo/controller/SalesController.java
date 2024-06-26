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

import com.wipro.demo.entity.Sales;
import com.wipro.demo.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {
	@Autowired
	private SalesService ss;
	
	@PostMapping
	public Sales create(@RequestBody Sales sales) {
		return ss.create(sales);
	}

	@GetMapping
	public List<Sales> read() {
		return ss.read();
	}
	
	@GetMapping("/{id}")
	public Sales read(@PathVariable("id") Integer id) {
		return ss.read(id);
	}
	
	@PutMapping
	public Sales update(@RequestBody Sales sales) {
		return ss.update(sales);
	}
	
	@DeleteMapping("/{id}")
	public Sales delete(@PathVariable("id")Integer id) {
		return ss.delete(id);
	}
	
}
