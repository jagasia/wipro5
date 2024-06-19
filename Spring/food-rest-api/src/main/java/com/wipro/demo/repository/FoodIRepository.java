package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Food;

@Repository
public interface FoodIRepository extends JpaRepository<Food, Integer>
{

}
