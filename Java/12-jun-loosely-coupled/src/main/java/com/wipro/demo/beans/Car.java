package com.wipro.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("sony")
	private Audio audio;	
	
	public Car() {}

	
	public Car(Audio audio) {
		super();
		this.audio = audio;
	}


	public Audio getAudio() {
		return audio;
	}


	public void setAudio(Audio audio) {
		this.audio = audio;
	}


	public void playMusic()
	{
		audio.play();
	}
}
