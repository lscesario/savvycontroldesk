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
		employee.setEmployee_birth_country("Brazil");
		em.persist(employee);
	}
	
	public List<Employee> list() {
		return em.createQuery("select a from Employee a", Employee.class).getResultList();
	}

	public Employee loadSingleEmployee(String email){
		System.out.println("Chegou aqui man" + email);
		
		
		return em
				.createQuery("select c from Employee c where c.employee_email=:employee_email", Employee.class)
				.setParameter("employee_email",email).getSingleResult();
	}
		
	public Employee getById(long parseLong) {
		return em.find(Employee.class, parseLong);
	}
}		
