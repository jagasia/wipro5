package com.wipro.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.demo.dao.EmployeeDaoImpl;
import com.wipro.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    	
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDaoImpl edao=(EmployeeDaoImpl) ctx.getBean("edao");
        Employee employee=new Employee(null, "Venkata Suraj", "CSE", 1212121);
        edao.create(employee);
        List<Employee> employees = edao.read();
        for(Employee e : employees)
        {
        	System.out.println(e);
        }
        System.out.println("Done");
    }
}
