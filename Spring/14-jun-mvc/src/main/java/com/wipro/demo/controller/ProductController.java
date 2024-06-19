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
import com.wipro.demo.entity.Product;
import com.wipro.demo.service.CategoryService;
import com.wipro.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	@Autowired
	private CategoryService cs;
	
	@GetMapping
	public ModelAndView showProductPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		List<Category> categories = cs.read();
		mv.addObject("products",products);
		mv.addObject("product",new Product());
		mv.addObject("categories",categories);
		return mv;
	}
	
	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addProduct(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("price") Integer price,@RequestParam("category") Integer categoryId)
	{
		Category category = cs.read(categoryId);
		Product product=new Product(null, name, category, price);
		System.out.println(product);
		ps.create(product);
		return showProductPage();
	}
	
	@PostMapping(value = "/dml", params = "update")
	public ModelAndView updateProduct(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("price") Integer price,@RequestParam("category") Integer categoryId)
	{
		Category category = cs.read(categoryId);
		Product product=new Product(id, name, category, price);

		System.out.println(product);
		ps.update(product);
		return showProductPage();
	}
	
	@PostMapping(value = "/dml", params = "delete")
	public ModelAndView deleteProduct(@RequestParam("id") Integer id)
	{
		System.out.println(id);
		ps.delete(id);
		return showProductPage();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id") Integer id)
	{
		Product product = ps.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = ps.read();
		mv.addObject("products",products);
		mv.addObject("product",product);
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
