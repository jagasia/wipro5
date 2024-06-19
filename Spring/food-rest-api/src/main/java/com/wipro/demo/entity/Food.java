package com.wipro.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer price;
	private String category;
	
	public Food() {}

	public Food(Integer id, String name, Integer price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
}
