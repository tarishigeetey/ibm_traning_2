package com.ibm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Passport implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(length = 15)
	private String country;
	@Column(name = "passport_no")
	private int number;
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(String country, int number) {
		this.country = country;
		this.number = number;
	}
	

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}



	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Passport {country:" + country + "\", number:" + number + "}";
	}

	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
}

