package com.example.demo;

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

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository er;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return er.save(employee);
	}
	
	@GetMapping
	public List<Employee> read() {
		return er.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee readById(@PathVariable("id") Integer id) {
		return er.findById(id).get();
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return er.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id") Integer id) {
		Employee emp = readById(id);
		er.delete(emp);
		return emp;
	}
	
}
