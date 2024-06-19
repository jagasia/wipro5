package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.entity.Category;
import com.wipro.demo.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService ps;
	
	@GetMapping
	public ModelAndView showCategoryPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("category");
		List<Category> categorys = ps.read();
		mv.addObject("categories",categorys);
		mv.addObject("category",new Category());
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addCategory(@ModelAttribute Category category)
	{
		System.out.println(category);
		ps.create(category);
		return showCategoryPage();
	}
	
	@PostMapping(value = "/dml", params = "update")
	public ModelAndView updateCategory(@ModelAttribute Category category)
	{
		System.out.println(category);
		ps.update(category);
		return showCategoryPage();
	}
	
	@PostMapping(value = "/dml", params = "delete")
	public ModelAndView deleteCategory(@ModelAttribute Category category)
	{
		System.out.println(category);
		ps.delete(category.getId());
		return showCategoryPage();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id") Integer id)
	{
		Category category = ps.read(id);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("category");
		List<Category> categorys = ps.read();
		mv.addObject("categories",categorys);
		mv.addObject("category",category);
		return mv;		
	}
	
	@GetMapping("/eswar")
	@ResponseBody
	public String abcd()
	{
		return "B.Eswar says yes sir";
		//basically a controller method should return viewname (jsp)
		//but here, we return string which is not viewname but content 
	}
	
}
