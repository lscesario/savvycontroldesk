package com.savvy.v1.controldesk.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.savvy.v1.controldesk.entities.Role;

public class EmployeeRolesDAO {

	@PersistenceContext
	private EntityManager em;
	
	public List<Role> loadEmployeeRoles() {
		return em.createQuery("select a from EmployeeRoles a", Role.class).getResultList();
	}
	
}
