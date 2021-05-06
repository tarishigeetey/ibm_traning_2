package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Todo;
import com.ibm.entity.User;
import com.ibm.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService{

	@Autowired
	public ToDoRepository repo;
	
	@Autowired
	public UserService uservice;
	
	@Override
	public int addTodo(Todo todo, int userid) {
		User user = uservice.getUser(userid);
		todo.setUser(user);
		repo.save(todo);
		return todo.getTodo_id();
	}

	@Override
	public Todo getToDo(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Todo> todobyUser(int userid) {
		return repo.findByAllUser(userid);
	}

	@Override
	public boolean removeTodo(int id) {
		repo.delete(repo.findById(id).get());
		return false;
	}

	@Override
	public Todo updateTodo(Todo todo) {
		repo.save(todo);
		return todo;
	}


}
