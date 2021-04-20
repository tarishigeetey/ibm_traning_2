package com.ibm.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "quiz_users")
public class User {

	@Id
	@GeneratedValue
	private int uid;
	@Column(name = "user_name", length = 20)
	private String username;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name= "qcode")
	private Quiz quiz;
	
	@Column(length = 10)
	private  String result;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	

	
}
