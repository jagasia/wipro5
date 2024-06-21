package com.wipro.demo.service;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Food;
import com.wipro.demo.repository.FoodIRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FoodService {
	@Autowired
	private FoodIRepository fr;
	
	public Mono<Food> create(Food food)
	{
		return fr.save(food);
	}
	
	public Flux<Food> read() {
		return fr.findAll();
	}
	
	public Mono<Food> read(Integer id) {
		return fr.findById(id);		
	}
	
	public Mono<Food> update(Food food) {
		return fr.save(food);
	}
	public Mono<Void> delete(Integer id) {
		return fr.deleteAll(read(id));	
	}
	
}
