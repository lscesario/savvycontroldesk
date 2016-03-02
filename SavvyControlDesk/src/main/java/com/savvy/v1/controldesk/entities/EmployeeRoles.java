package com.savvy.v1.controldesk.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class EmployeeRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_role_id;
	private String employee_role_name;

	
	
 	public Integer getEmployee_role_id() {
		return employee_role_id;
	}

	public void setEmployee_role_id(Integer employee_role_id) {
		this.employee_role_id = employee_role_id;
	}

	public String getEmployee_role_name() {
		return employee_role_name;
	}

	public void setEmployee_role_name(String employee_role_name) {
		this.employee_role_name = employee_role_name;
	}
	
}
