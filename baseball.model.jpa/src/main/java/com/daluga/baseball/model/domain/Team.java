package com.daluga.baseball.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="TEAM", schema="BASEBALL")
public class Team extends Domain {
	
	@Id
	@GeneratedValue
	@Column(name="ID")	
	private int id;
	
	@Column(name="CODE")
	@NotBlank(message="Team Code is a required field.")
	@Length(max=3, message="Team Code exceeds a length of 3.")
	private String code;

	@Column(name="ABBREVIATION")
	@NotBlank(message="Team Abbreviation is a required field.")
	@Length(max=3, message="Team Abbreviation exceeds a length of 3.")
	private String abbreviation;

	@Column(name="NAME")
	@NotBlank(message="Team Name is a required field.")
	@Length(max=3, message="Team Name exceeds a length of 30.")
	private String name;

	@Column(name="CITY")
	@NotBlank(message="Team City is a required field.")
	@Length(max=3, message="Team City exceeds a length of 30.")
	private String city;

	@Column(name="STADIUM")
	@NotBlank(message="Team Stadium is a required field.")
	@Length(max=3, message="Team Stadium exceeds a length of 30.")
	private String stadium;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
}
