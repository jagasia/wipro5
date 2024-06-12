package com.wipro.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com"})
public class MyConfiguration {

	@Bean
	public Department dept() //method name is the bean name
	{
		return new Department(11,"IT",989898989);
	}
	
	@Bean
	public Employee emp()	//emp is the name of the bean
	{
		Employee emp=new Employee();
		emp.setId(111);
		emp.setName("Sai Charan");
		emp.setDepartment(dept());
		emp.setSalary(1212121);
		return emp;
	}
}
