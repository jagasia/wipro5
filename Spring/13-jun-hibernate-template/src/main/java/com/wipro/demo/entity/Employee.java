package com.wipro.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity			//this class becomes a table in the database
//@Table(name = "EMP")		//if you do not use this, then class name=tablename
public class Employee {
	@Id					//the following property becomes PRIMARY KEY		//compulsory
	@GeneratedValue(strategy = GenerationType.AUTO)		//auto generated, ignore this value
	private Integer id;
//	@Column(name = "EMPLOYEE_NAME")		//if you want to choose column name
	private String name;
	private String department;
	private Integer salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
