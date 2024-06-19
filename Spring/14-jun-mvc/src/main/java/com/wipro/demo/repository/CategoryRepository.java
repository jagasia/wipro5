package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>
{

}
