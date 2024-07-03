package com.example.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

	@GetMapping
	public String home()
	{
		
		return  "Hello world";
	}

    @GetMapping("/orders/{id}/product")
    public Product getProductById(@PathVariable Long id) {
    	RestTemplate rt=new RestTemplate();    	
        return rt.getForEntity("http://localhost:5001/products/1", Product.class).getBody(); 
    }
}