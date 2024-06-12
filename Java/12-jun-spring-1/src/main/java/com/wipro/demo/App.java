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
    	Employee employee= (Employee) ctx.getBean("emp");
    	System.out.println(employee);
        System.out.println( "Hello World!" );
    }
}
