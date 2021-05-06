package com.ibm.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "todo")
public class Todo {
	
	@Id
	@GeneratedValue
	private int todo_id;
	private LocalDate assign_date;
	private LocalDate finish_date;
	
	private String category;
	private String priority;
	private String task;
	private String status;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;

	public int getTodo_id() {
		return todo_id;
	}

	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}

	public LocalDate getAssign_date() {
		return assign_date;
	}

	public void setAssign_date(LocalDate assign_date) {
		this.assign_date = assign_date;
	}

	public LocalDate getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(LocalDate finish_date) {
		this.finish_date = finish_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
