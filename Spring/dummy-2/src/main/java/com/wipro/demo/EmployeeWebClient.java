package com.wipro.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class EmployeeWebClient {

    WebClient client = WebClient.create("http://localhost:6001");

 	public void findProduct() {
	 Mono<Product> employeeMono = client.get()
			  .uri("/product/{id}", "1")
			  .retrieve()
			  .bodyToMono(Product.class);

	 employeeMono.subscribe(System.out::println);
			
}
}