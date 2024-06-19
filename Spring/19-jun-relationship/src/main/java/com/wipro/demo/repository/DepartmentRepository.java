package com.wipro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.demo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}
