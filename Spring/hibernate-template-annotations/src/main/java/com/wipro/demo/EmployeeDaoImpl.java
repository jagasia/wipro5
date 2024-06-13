package com.wipro.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("edao")
public class EmployeeDaoImpl {
	@Autowired
	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht)
	{
		this.ht=ht;
	}
	
	//insert a row into table
	//to add a row, we need to supply values
	@Transactional
	public void create(Employee employee) {
		Session session = ht.getSessionFactory().openSession();
		Transaction tran = session.getTransaction();
		ht.save(employee);
		tran.commit();
		session.close();
		System.out.println("Insert successful");
	}
	
	//read all  rows from  the table
	public List<Employee> read() {
		return ht.loadAll(Employee.class);
	}
	
	//read one row form the table based on id
	public Employee read(Integer id) {
		return ht.get(Employee.class, id);
	}
	
	//update a row
	public void update(Employee employee) {
		Employee temp = read(employee.getId());
		if(temp!=null)
		{
			ht.update(employee);
		}
	}
	
	//delete a row
	public void delete(Integer id) {
		Employee temp=read(id);
		if(temp!=null)
		{
			ht.delete(temp);
		}
	}
	
}
