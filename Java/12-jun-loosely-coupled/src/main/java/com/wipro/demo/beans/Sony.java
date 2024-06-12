package com.wipro.demo.beans;

import org.springframework.stereotype.Component;

@Component("sony")
public class Sony implements Audio{
	public void play()
	{
		System.out.println("Sony plays good music");
	}
}
