package com.wipro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesRestApiApplication.class, args);
		System.out.println("Sales api is running now");
	}

}
