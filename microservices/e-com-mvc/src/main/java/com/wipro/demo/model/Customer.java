package com.wipro.demo.model;

import java.util.List;


public class Customer {
	private Integer id;
	private String name;
	private String mobile;
	private List<Sales> sales;
	
	public Customer() {}

	public Customer(Integer id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	

	public Customer(Integer id, String name, String mobile, List<Sales> sales) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.sales = sales;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	

}
