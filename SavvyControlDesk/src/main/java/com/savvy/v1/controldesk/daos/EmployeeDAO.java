package com.savvy.v1.controldesk.daos;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.savvy.v1.controldesk.entities.Employee;


@Dependent
public class EmployeeDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Employee employee){
		em.persist(employee);
	}
	
	public List<Employee> list() {
		return em.createQuery("select a from Employee a", Employee.class).getResultList();
	}

	public Employee loadSingleEmployee(Employee e){
		return em.find(Employee.class, e);
	}
		
	
}