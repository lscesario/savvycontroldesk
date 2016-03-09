package com.savvy.v1.controldesk.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_id;
	@ManyToOne (fetch = FetchType.EAGER)
	private Job employee_job;
	private String employee_email;
	private String employee_password;
	private String employee_historical_password;
	private String employee_curp;
	@ManyToOne(fetch = FetchType.EAGER)
	private ActorStatus actor_status_id;
	private String employee_first_name;
	private String employee_middle_name;
	private String employee_last_name;
	@Temporal(TemporalType.DATE)
	private Date employee_birth_date;
	private String employee_birth_country;
	private String employee_gender;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar employee_updated_date;
	private String employee_updated_by;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar employee_creation_date;
	private Calendar employee_password_last_update;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar employee_left_date;
	
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	public Job getEmployee_job() {
		return employee_job;
	}
	public void setEmployee_job(Job employee_job) {
		this.employee_job = employee_job;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getEmployee_password() {
		return employee_password;
	}
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	public String getEmployee_historical_password() {
		return employee_historical_password;
	}
	public void setEmployee_historical_password(String employee_historical_password) {
		this.employee_historical_password = employee_historical_password;
	}
	public String getEmployee_curp() {
		return employee_curp;
	}
	public void setEmployee_curp(String employee_curp) {
		this.employee_curp = employee_curp;
	}
	public ActorStatus getActor_status_id() {
		return actor_status_id;
	}
	public void setActor_status_id(ActorStatus actor_status_id) {
		this.actor_status_id = actor_status_id;
	}
	public String getEmployee_first_name() {
		return employee_first_name;
	}
	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}
	public String getEmployee_middle_name() {
		return employee_middle_name;
	}
	public void setEmployee_middle_name(String employee_middle_name) {
		this.employee_middle_name = employee_middle_name;
	}
	public String getEmployee_last_name() {
		return employee_last_name;
	}
	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}
	public Date getEmployee_birth_date() {
		return employee_birth_date;
	}
	public void setEmployee_birth_date(Date employee_birth_date) {
		this.employee_birth_date = employee_birth_date;
	}
	public String getEmployee_birth_country() {
		return employee_birth_country;
	}
	public void setEmployee_birth_country(String employee_birth_country) {
		this.employee_birth_country = employee_birth_country;
	}
	public String getEmployee_gender() {
		return employee_gender;
	}
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}
	public Calendar getEmployee_updated_date() {
		return employee_updated_date;
	}
	public void setEmployee_updated_date(Calendar date) {
		this.employee_updated_date = date;
	}
	public String getEmployee_updated_by() {
		return employee_updated_by;
	}
	public void setEmployee_updated_by(String employee_updated_by) {
		this.employee_updated_by = employee_updated_by;
	}
	public Calendar getEmployee_creation_date() {
		return employee_creation_date;
	}
	public void setEmployee_creation_date(Calendar employee_creation_date) {
		this.employee_creation_date = employee_creation_date;
	}
	public Calendar getEmployee_password_last_update() {
		return employee_password_last_update;
	}
	public void setEmployee_password_last_update(Calendar employee_password_last_update) {
		this.employee_password_last_update = employee_password_last_update;
	}
	public Calendar getEmployee_left_date() {
		return employee_left_date;
	}
	public void setEmployee_left_date(Calendar employee_left_date) {
		this.employee_left_date = employee_left_date;
	}


	public String toString(){
		return  this.employee_first_name.toString() +
				this.employee_email.toString() +
				this.employee_gender.toString() +
				this.employee_last_name.toString()+
				this.employee_curp.toString();
		}
	
}
