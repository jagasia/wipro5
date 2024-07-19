package com.wipro.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	@Query("select distinct p.category from Product p")
	List<String> getCategories();

}
