package com.savvy.v1.controldesk.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class EmployeeGroupType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer employee_group_type_id;
	String employee_group_type_id_description;
	
	public Integer getEmployee_group_type_id() {
		return employee_group_type_id;
	}
	public void setEmployee_group_type_id(Integer employee_group_type_id) {
		this.employee_group_type_id = employee_group_type_id;
	}
	public String getEmployee_group_type_id_description() {
		return employee_group_type_id_description;
	}
	public void setEmployee_group_type_id_description(String employee_group_type_id_description) {
		this.employee_group_type_id_description = employee_group_type_id_description;
	}
	
}
