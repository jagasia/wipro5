package com.wipro.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Product;
import com.wipro.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository pr;
	
	@Override
	public Product create(Product product) {
		return pr.save(product);
	}
	@Override
	public List<Product> read() {
		return pr.findAll();
	}
	@Override
	public Product read(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product p=null;
		if(temp.isPresent())
		{
			p=temp.get();
		}
		return p;
	}
	@Override
	public Product update(Product product) {
		Product p=read(product.getId());
		if(p!=null)
		{
			p=product;
			pr.save(p);
		}
		return p;
	}
	@Override
	public Product delete(Integer id) {
		Product p=read(id);
		if(p!=null)
		{			
			pr.delete(p);
		}
		return p;
	}
	@Override
	public List<String> getCategories() {
		return pr.getCategories();
	}
	

}
