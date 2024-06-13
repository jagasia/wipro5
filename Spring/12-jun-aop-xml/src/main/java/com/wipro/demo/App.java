package com.wipro.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        Bank bank = (Bank) ctx.getBean("bank");
        bank.withdraw();
        bank.deposit();
    }
}
