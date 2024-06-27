package com.wipro.demo.model;

import java.util.Date;

public class Sales {
	private Integer id;
	private Date dateOfSales;
	private Customer customer;
	private Product product;
	private Integer quantity;

	public Sales() {
	}

	public Sales(Integer id, Date dateOfSales, Customer customer, Product product, Integer quantity) {
		super();
		this.id = id;
		this.dateOfSales = dateOfSales;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfSales() {
		return dateOfSales;
	}

	public void setDateOfSales(Date dateOfSales) {
		this.dateOfSales = dateOfSales;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Sales [id=" + id + ", dateOfSales=" + dateOfSales + ", customer=" + customer.getName() + ", product="
				+ product.getName() + ", quantity=" + quantity + "]";
	}

}
