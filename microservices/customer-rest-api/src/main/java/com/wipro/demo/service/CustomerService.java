package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Customer;
import com.wipro.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) {
		return cr.save(customer);
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer customer=null;
		if(temp.isPresent())
			customer=temp.get();
		return customer;
	}	
	public Customer update(Customer customer) {
		Customer temp = read(customer.getId());
		if(temp!=null)
		{
			temp=customer;
			cr.save(temp);
		}
		return temp;
	}
	public Customer delete(Integer id) {
		Customer temp = read(id);
		if(temp!=null)
		{			
			cr.delete(temp);
		}
		return temp;
	}
	

}
