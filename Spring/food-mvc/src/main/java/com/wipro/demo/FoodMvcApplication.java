package com.wipro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FoodMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodMvcApplication.class, args);
	}

}
