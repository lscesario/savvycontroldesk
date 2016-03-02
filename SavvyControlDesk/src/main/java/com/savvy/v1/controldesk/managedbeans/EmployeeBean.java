package com.savvy.v1.controldesk.managedbeans;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.savvy.v1.controldesk.daos.EmployeeDAO;
import com.savvy.v1.controldesk.entities.Country;
import com.savvy.v1.controldesk.entities.Employee;
import com.savvy.v1.controldesk.helpers.EmployeeManager;

@Model
public class EmployeeBean {
	
	@Inject
	private EmployeeDAO employeeDAO;
	private Employee employee = new Employee();
	private List<Employee> employees;
	@Inject
	EmployeeManager empMan;
	private Country country;
	
	
	@Transactional
	public String save(){
		empMan.updateEmployeeDates(employee);		
		employeeDAO.save(employee);
		
		return "/scd/employees/list?faces-redirect=true";
	}
	
	public Employee loadSingleEmployee(Employee e){
		return employeeDAO.loadSingleEmployee(e);	
	}
	
	

	//G'N'S
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee() {
		return employee;
	}

	
	public Country getCountry() {
		return country;
	}
	
	
	
	
}

