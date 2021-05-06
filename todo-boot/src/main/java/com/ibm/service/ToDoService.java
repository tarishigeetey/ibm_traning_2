package com.ibm.service;

import java.util.List;

import com.ibm.entity.Todo;

public interface ToDoService {
	
	int addTodo(Todo todo, int userid);
	
	Todo getToDo(int id);
	
	List<Todo> todobyUser(int userid);
	
	boolean removeTodo(int id);
	
	Todo updateTodo(Todo todo);

}
