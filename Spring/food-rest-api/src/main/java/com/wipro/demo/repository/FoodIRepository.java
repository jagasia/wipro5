package com.wipro.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Food;

@Repository
public interface FoodIRepository extends JpaRepository<Food, Integer>
{
	@Query("select distinct f.category from Food f")
	List<String> getAllCategories();
}
