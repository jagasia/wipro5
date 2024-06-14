package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Product;
import com.wipro.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product product) {
		return pr.save(product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product p=null;
		if(temp.isPresent())
		{
			p=temp.get();
		}
		return p;
	}
	public Product update(Product product) {
		Product temp = read(product.getId());
		if(temp!=null)
		{
			temp=product;
			pr.save(temp);
		}
		return temp;
	}
	public Product delete(Integer id) {
		Product temp=read(id);
		if(temp!=null)
		{
			pr.delete(temp);
		}
		return temp;
	}
	
}
