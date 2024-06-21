package com.wipro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;

//@EnableWebFlux
//@EnableR2dbcRepositories
//@EnableConfigurationProperties
//@EnableScheduling
@SpringBootApplication
@RestController
public class Application {

	@GetMapping
	public String home()
	{
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hi...");
	}

}
