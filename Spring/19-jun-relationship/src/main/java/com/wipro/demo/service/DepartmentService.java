package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.entity.Department;
import com.wipro.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;
	
	public Department create(Department department) {
		return dr.save(department);
	}
	public List<Department> read() {
		return dr.findAll();
	}
	public Department read(Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department d=null;
		if(temp.isPresent())
		{
			d=temp.get();
		}
		return d;
	}
	public Department update(Department department) {
		Department temp = read(department.getId());
		if(temp!=null)
		{
			temp=department;
			dr.save(temp);
		}
		return temp;
	}
	public Department delete(Integer id) {
		Department temp = read(id);
		if(temp!=null)
		{
			dr.save(temp);
		}
		return temp;		
	}
	

}
