package com.portfolio.rest.portifoliorest.user;

import java.time.LocalDate;
import java.util.Date;

public class User {
	
	private Integer id; 
	
	private String name; 
	
	private String birthDate;
	
	protected User () {
	
	}

	public User(int i, String string, LocalDate minusYears) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
