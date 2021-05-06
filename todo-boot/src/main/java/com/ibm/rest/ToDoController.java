package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Todo;
import com.ibm.entity.User;
import com.ibm.service.ToDoServiceImpl;
import com.ibm.service.UserServiceImpl;

@CrossOrigin()
@RestController
public class ToDoController {
	
	@Autowired
	private ToDoServiceImpl service;
	
	@PostMapping(value = "/todo/{userid}")
	public int addTodo(@RequestBody Todo todo, @PathVariable int userid) {
		service.addTodo(todo, userid);
		return 0;
	}

	@GetMapping(value = "/todo/{id}", produces = "application/json")
	public Todo getToDo(@PathVariable int id) {
		return service.getToDo(id);
	}

	@GetMapping(value = "/todo/user/{userid}", produces = "application/json")
	public List<Todo> todobyUser(@PathVariable int userid) {
		return service.todobyUser(userid);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String removeTodo(@PathVariable int id) {
		service.removeTodo(id);
		return "success!";
	}

	@PostMapping(value = "/update", consumes = "application/json")
	public String updateTodo(@RequestBody Todo todo) {
		service.updateTodo(todo);
		return "Success!";
	}

}
