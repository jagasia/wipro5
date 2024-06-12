package com.wipro.demo.beans;

import org.springframework.stereotype.Component;

@Component("jbl")
public class Jbl implements Audio
{
	public void play()
	{
		System.out.println("Music from jbl speakers are nice");
	}
}
