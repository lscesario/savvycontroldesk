package com.savvy.v1.controldesk.daos;

import java.util.List;

import javax.ejb.Stateful;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.savvy.v1.controldesk.entities.Employee;


@Dependent
@Stateful
public class EmployeeDAO {

	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	private EntityManager em;
	
	public void save(Employee employee){
		em.persist(employee);
	}
	
	public List<Employee> loadEmployees() {
		return em.createQuery("select a from Employee a", Employee.class).getResultList();
	}

	public Employee getById(Integer id) {
		return em.find(Employee.class, id);
	}

	public Employee loadSingleEmployeeByEmail(String email) {
		return em
				.createQuery("select c from Employee c where c.employee_email=:employee_email", Employee.class)
				.setParameter("employee_email",email).getSingleResult();
	}
}		
