package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
