package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Category;
import com.wipro.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cr;
	
	public Category create(Category category) {
		return cr.save(category);
	}
	public List<Category> read() {
		return cr.findAll();
	}
	public Category read(Integer id) {
		Optional<Category> temp = cr.findById(id);
		Category p=null;
		if(temp.isPresent())
		{
			p=temp.get();
		}
		return p;
	}
	public Category update(Category category) {
		Category temp = read(category.getId());
		if(temp!=null)
		{
			temp=category;
			cr.save(temp);
		}
		return temp;
	}
	public Category delete(Integer id) {
		Category temp=read(id);
		if(temp!=null)
		{
			cr.delete(temp);
		}
		return temp;
	}
	
}
