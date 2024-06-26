package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Sales;
import com.wipro.demo.repository.SalesRepository;

@Service
public class SalesService {
	@Autowired
	private SalesRepository sr;
	
	public Sales create(Sales sales) {
		return sr.save(sales);
	}
	public List<Sales> read() {
		return sr.findAll();
	}
	public Sales read(Integer id) {
		Optional<Sales> temp = sr.findById(id);
		Sales sales=null;
		if(temp.isPresent())
			sales=temp.get();
		return sales;
	}	
	public Sales update(Sales sales) {
		Sales temp = read(sales.getId());
		if(temp!=null)
		{
			temp=sales;
			sr.save(temp);
		}
		return temp;
	}
	public Sales delete(Integer id) {
		Sales temp = read(id);
		if(temp!=null)
		{			
			sr.delete(temp);
		}
		return temp;
	}
	

}
