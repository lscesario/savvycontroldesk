package com.savvy.v1.controldesk.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.savvy.v1.controldesk.daos.EmployeeDAO;
import com.savvy.v1.controldesk.entities.Employee;

@FacesConverter("employeeConverter")
public class EmployeeConverter implements Converter {

	@Inject
	EmployeeDAO employeeDao;
	
	 @Override
	    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	        Employee e = employeeDao.getById(Long.parseLong(value));
	        return e;
	    }

	    @Override
	    public String getAsString(FacesContext context, UIComponent component, Object value) {
	    	Employee e = (Employee) value;
	        return String.valueOf( e.getEmployee_id());
	    }

}
