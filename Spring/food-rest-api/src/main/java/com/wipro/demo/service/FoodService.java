package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Food;
import com.wipro.demo.repository.FoodIRepository;

@Service
public class FoodService {
	@Autowired
	private FoodIRepository fr;
	
	public Food create(Food food) {
		return fr.save(food);
	}
	public List<Food> read() {
		return fr.findAll();
	}
	public Food read(Integer id) {
		Optional<Food> temp = fr.findById(id);
		Food food=null;
		if(temp.isPresent())
		{
			food=temp.get();
		}
		return food;
	}
	public Food update(Food food) {
		Food f = read(food.getId());
		if(f!=null)
		{
			f=food;
			fr.save(f);
		}
		return f;
	}
	public Food delete(Integer id) {
		Food food=read(id);
		if(food!=null)
		{
			fr.delete(food);		
		}
		return food;
	}
	
	public List<String> getAllCategories()
	{
		return fr.getAllCategories();
	}
	
}
