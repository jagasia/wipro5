package com.wipro.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//we cannot use ClassPathXMLConfiguration here, because,
    	//we are not using xml configuration. So we use following:
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
    	//since we are not using configuration class
    	ctx.scan("com.wipro.demo"); 	//base location where bean classes are present
    	//"com" is sufficient		any sub class containing bean will  be found
    	//base package name is enough
    	ctx.refresh();
    	Employee emp=(Employee) ctx.getBean(Employee.class);
    	
    	System.out.println(emp);
    	
    	System.out.println("Hello world");
    }
}
