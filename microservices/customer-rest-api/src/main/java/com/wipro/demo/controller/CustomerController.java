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

import com.wipro.demo.entity.Customer;
import com.wipro.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return cs.create(customer);
	}

	@GetMapping
	public List<Customer> read() {
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public Customer read(@PathVariable("id") Integer id) {
		return cs.read(id);
	}
	
	@PutMapping
	public Customer update(@RequestBody Customer customer) {
		return cs.update(customer);
	}
	
	@DeleteMapping("/{id}")
	public Customer delete(@PathVariable("id")Integer id) {
		return cs.delete(id);
	}
	
}
