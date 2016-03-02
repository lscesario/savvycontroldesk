package com.savvy.v1.controldesk.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActorStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer actor_status_id;
	private String actor_status_description;
	private String[] actor_status_applicable_for;
	
	public Integer getActor_status_id() {
		return actor_status_id;
	}
	public void setActor_status_id(Integer actor_status_id) {
		this.actor_status_id = actor_status_id;
	}
	public String getActor_status_description() {
		return actor_status_description;
	}
	public void setActor_status_description(String actor_status_description) {
		this.actor_status_description = actor_status_description;
	}
	public String[] getActor_status_applicable_for() {
		return actor_status_applicable_for;
	}
	public void setActor_status_applicable_for(String[] actor_status_applicable_for) {
		this.actor_status_applicable_for = actor_status_applicable_for;
	}
	
}
