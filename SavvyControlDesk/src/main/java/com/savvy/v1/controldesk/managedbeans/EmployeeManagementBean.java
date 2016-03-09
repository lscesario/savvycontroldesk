package com.savvy.v1.controldesk.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.savvy.v1.controldesk.daos.CountryDAO;
import com.savvy.v1.controldesk.daos.EmployeeDAO;
import com.savvy.v1.controldesk.daos.JobDAO;
import com.savvy.v1.controldesk.entities.Country;
import com.savvy.v1.controldesk.entities.Employee;
import com.savvy.v1.controldesk.entities.Job;
import com.savvy.v1.controldesk.entities.Role;
import com.savvy.v1.controldesk.helpers.EmployeeManager;


@Model
public class EmployeeManagementBean{
	
	
	private Employee employee = new Employee();
	private Country country = new Country();
	private Integer employee_id;
	
	@Inject
	private EmployeeManager empMan;
	@Inject
	private EmployeeDAO employeeDAO;
	@Inject
	private CountryDAO countryDAO;
	@Inject
	private JobDAO jobDAO;
	
	
	
	private List<Job> jobs;
	private List<Country> countries;
	private List<Employee> employees;
	
	@Transactional
	public String save(){
		empMan.initializeEmployeeDates(employee);
		//empMan.updateEmployeeStatus(employee,1);
		empMan.setLastUpdateSlave(employee);
		employeeDAO.save(employee);
		return "/scd/employees/register?faces-redirect=true";
	}
	
	public void loadSingleEmployeeByEmail(String email){
		this.employee = employeeDAO.loadSingleEmployeeByEmail(email);	
	}
	
	public void loadSingleEmployeeById(){
		this.employee = employeeDAO.getById(employee_id);	
	}
	
	@PostConstruct
	public void load(){
		this.jobs = jobDAO.loadJobs();
		this.countries = countryDAO.loadCountries();
		this.employees = employeeDAO.loadEmployees();
	}

	//G'n'S
	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	public List<Job> getJobs() {
		return jobs;
	}

	public Country getCountry() {
		return country;
	}
	
	public List<Country> getCountries() {
		return countries;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	
	
	
}

