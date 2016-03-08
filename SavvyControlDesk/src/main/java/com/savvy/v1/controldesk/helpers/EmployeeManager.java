package com.savvy.v1.controldesk.helpers;

import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import com.savvy.v1.controldesk.entities.ActorStatus;
import com.savvy.v1.controldesk.entities.Country;
import com.savvy.v1.controldesk.entities.Employee;
import com.savvy.v1.controldesk.entities.EmployeeRoles;

public class EmployeeManager {
	
	@Inject
	ActorStatus actorstatus;
	@Inject
	Country country;

	
	public Employee initializeEmployeeDates(Employee employee) {
		
		Calendar currentTime = Calendar.getInstance();
				
		employee.setEmployee_left_date(null);
		employee.setEmployee_updated_date(currentTime);
		employee.setEmployee_creation_date(currentTime);
		employee.setEmployee_password_last_update(currentTime);
						
		return employee;
	}
	

	public Employee updateEmployeeStatus(Employee employee, Integer status) {
		actorstatus.setActor_status_id(status);
		employee.setActor_status_id(actorstatus);		
		return employee;
	}

	
}
