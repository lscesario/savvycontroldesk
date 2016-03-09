package com.savvy.v1.controldesk.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer job_id;
	private String job_description;
	@ManyToMany
	private List<Role> employee_roles;
	
	
	public Integer getJob_id() {
		return job_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public List<Role> getEmployee_roles() {
		return employee_roles;
	}
	public void setEmployee_roles(List<Role> employee_roles) {
		this.employee_roles = employee_roles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
