package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.api.FoodApi;
import com.wipro.demo.model.Food;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodApi api;
	
	@GetMapping
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("food");
		//retrieve all food using api
		List<Food> foods = api.retrieveAllProducts();
		mv.addObject("foods",foods);
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addFood(Food food)
	{
		api.addProduct(food);
		return home();
	}

	@PostMapping(value = "/dml", params = "update")
	public ModelAndView updateFood(Food food)
	{
		api.updateProduct(food);
		return home();
	}
	
	@PostMapping(value = "/dml", params = "delete")
	public ModelAndView deleteFood(Food food)
	{
		api.deleteProduct(food.getId());
		return home();
	}
	
}
