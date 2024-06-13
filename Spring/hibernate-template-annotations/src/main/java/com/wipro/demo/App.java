package com.wipro.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
    	EmployeeDaoImpl edao=(EmployeeDaoImpl) ctx.getBean("edao");
    	edao.create(new Employee(null, "Jag", "ECE", 111222));
    	List<Employee> employees = edao.read();
    	for(Employee e : employees)
    	{
    		System.out.println(e);
    	}
        System.out.println( "Hello World!" );
    }
}
