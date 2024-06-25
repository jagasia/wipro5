package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
	@Autowired
	CircuitBreakerFactory cbf;
	
	
	public String getAlbumList() {
		RestTemplate restTemplate=new RestTemplate();
	    CircuitBreaker circuitBreaker = cbf.create("circuitbreaker");
//	    String url = "http://localhost:1234/not-real";
	    
	    String url="https://jsonplaceholder.typicode.com/albums";
	    
	    return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class), 
	      throwable -> getDefaultAlbumList());
	}

	private String getDefaultAlbumList() {
		// TODO Auto-generated method stub
		return "Album is not available right now";
	}
	
	
}
