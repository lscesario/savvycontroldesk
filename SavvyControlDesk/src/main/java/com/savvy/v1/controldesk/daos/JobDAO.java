package com.savvy.v1.controldesk.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.savvy.v1.controldesk.entities.Job;

public class JobDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Job> loadJobs() {
		return em.createQuery("select a from Job a", Job.class).getResultList();
	}
	

}
