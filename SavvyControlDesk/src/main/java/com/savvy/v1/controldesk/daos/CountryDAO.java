package com.savvy.v1.controldesk.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.savvy.v1.controldesk.entities.Country;

public class CountryDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Country country){
		em.persist(country);
	}
	
	public List<Country> loadCountries() {
		return em.createQuery("select a from Country a", Country.class).getResultList();
	}

	
	
}
