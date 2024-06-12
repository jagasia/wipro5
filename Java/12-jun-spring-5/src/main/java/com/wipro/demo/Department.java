package com.wipro.demo;

public class Department {
	private Integer id;
	private String name;
	private Integer budget;
	
	public Department() {}

	public Department(Integer id, String name, Integer budget) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
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

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", budget=" + budget + "]";
	}
	
}
