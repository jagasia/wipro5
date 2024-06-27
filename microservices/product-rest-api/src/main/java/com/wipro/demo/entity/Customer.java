package com.wipro.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String mobile;
//	@JsonIgnore
//	@JsonManagedReference
	@OneToMany(mappedBy = "customer")
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
