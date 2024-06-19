package com.wipro.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String  name;
	private Long budget;
	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER) //mappedBy will prevent creating new table	(is used whenever annotation ends with "Many")
	@JsonIgnore
	private List<Employee> employees;
	
	public Department() {}

	public Department(Integer id, String name, Long budget) {
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

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", budget=" + budget + "]";
	}
	
}
