package com.wipro.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component("logging")
public class MyAspect {
	
	@Pointcut("execution(* com.wipro.demo.*.*(..))")
	public void selectAll()
	{
		
	}
	
	@Before("selectAll()")
	public void beforeAdvice()
	{
		System.out.println("Before advice is called now");
	}
	
	@After("selectAll()")
	public void afterAdvice()
	{
		System.out.println("After advice is called now");
	}
}