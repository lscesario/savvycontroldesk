package com.savvy.v1.controldesk.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.savvy.v1.controldesk.daos.CountryDAO;
import com.savvy.v1.controldesk.daos.EmployeeDAO;
import com.savvy.v1.controldesk.daos.EmployeeRolesDAO;
import com.savvy.v1.controldesk.entities.Country;
import com.savvy.v1.controldesk.entities.Employee;
import com.savvy.v1.controldesk.entities.EmployeeRoles;
import com.savvy.v1.controldesk.helpers.EmployeeManager;

@Model
public class EmployeeManagementBean {
	
	
	private Employee employee = new Employee();
	private Country country = new Country();
	
	@Inject
	private EmployeeManager empMan;
	@Inject
	private EmployeeDAO employeeDAO;
	@Inject
	private CountryDAO countryDAO;
	@Inject
	private EmployeeRolesDAO employeeRolesDAO;
	
	private List<EmployeeRoles> employeeRoles;
	private List<Country> countries;
	private List<Employee> employees;
	
	@Transactional
	public String save(){
		empMan.initializeEmployeeDates(employee);
		empMan.updateEmployeeStatus(employee,1);
		employeeDAO.save(employee);
		
		return "/scd/employees/list?faces-redirect=true";
	}
	
	public Employee loadSingleEmployee(String email){
		return employeeDAO.loadSingleEmployee(email);	
	}
	
	@PostConstruct
	public void load(){
		this.employeeRoles = employeeRolesDAO.loadEmployeeRoles();
		this.countries = countryDAO.loadCountries();
	}

	//G'n'S
	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee() {
		return employee;
	}
	
	public List<EmployeeRoles> getEmployeeroles() {
		return employeeRoles;
	}

	public void setEmployeeroles(List<EmployeeRoles> employeeroles) {
		this.employeeRoles = employeeroles;
	}

	public Country getCountry() {
		return country;
	}
	
	public List<Country> getCountries() {
		return countries;
	}
	
}

