package org.mcet.demo;


import org.mcet.demo.config.MyConfiguration;
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

//    	ctx.getBean("");
    	System.out.println("done");
    }
}
