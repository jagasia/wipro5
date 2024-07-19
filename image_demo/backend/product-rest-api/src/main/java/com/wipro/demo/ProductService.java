package com.wipro.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Product;

@Service
public interface ProductService {

	Product create(Product product);

	List<Product> read();

	Product read(Integer id);

	Product update(Product product);

	Product delete(Integer id);
	
	List<String> getCategories();

}