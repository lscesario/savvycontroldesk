package com.savvy.v1.controldesk.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="country_id")
	private Integer country_id;
	
	@Column(name="country_code")
	private String country_code;

	@Column(name="country_flag_path")
	private String country_flag_path;

	@Column(name="country_name")
	private String country_name;
	

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_flag_path() {
		return country_flag_path;
	}

	public void setCountry_flag_path(String country_flag_path) {
		this.country_flag_path = country_flag_path;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}