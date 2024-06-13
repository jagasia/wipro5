package com.wipro.demo;

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
    	Bank bank = ctx.getBean(Bank.class);
    	bank.withdraw();
    	bank.deposit();
        System.out.println( "Hello World!" );
    }
}
