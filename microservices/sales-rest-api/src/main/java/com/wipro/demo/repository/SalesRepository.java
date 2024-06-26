package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer>
{

}
