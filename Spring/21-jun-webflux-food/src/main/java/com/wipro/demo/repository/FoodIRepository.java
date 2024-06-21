package com.wipro.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Food;

@Repository
public interface FoodIRepository extends ReactiveCrudRepository<Food, Integer>
{

}
