package com.savvy.v1.controldesk.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.savvy.v1.controldesk.daos.CountryDAO;
import com.savvy.v1.controldesk.entities.Country;


@Model
public class CountryManagementBean{

	@Inject
	CountryDAO clh;
	
	List<Country> countryList = null;
	
	@PostConstruct
	public void buildCountryList(){
		this.countryList=clh.loadCountries();
	}
	
	public List<Country> getCountryList() {
		return countryList;
	}
		
}
