package com.wipro.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.demo.beans.Car;
import com.wipro.demo.config.MyConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
    	Car car = ctx.getBean(Car.class);
    	car.playMusic();
        System.out.println( "Hello World!" );
    }
}
