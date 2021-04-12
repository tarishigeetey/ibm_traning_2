package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 30)
	private String name;
	private int age;
	@Column(length = 10)
	private String gender;
	
	@ManyToOne
	@JoinColumn(name = "pnr")
	private Ticket ticket;
	
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	
	public Passenger(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
