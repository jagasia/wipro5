package com.wipro.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//get object ref or  xml config
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Employee e1= (Employee) ctx.getBean("emp");
    	Employee e2= (Employee) ctx.getBean("emp");
    	e1.setName("Eswar");	
    	e2.setName("Parvathi");	
    	
    	System.out.println(e1.getName());
    	
    	
    	
    	
    	
    }
}
