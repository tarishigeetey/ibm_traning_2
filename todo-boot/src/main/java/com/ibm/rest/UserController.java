package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.service.ToDoServiceImpl;
import com.ibm.service.UserServiceImpl;

@CrossOrigin()
@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@PostMapping(value = "/user", consumes = "application/json")
	public void addUser(@RequestBody User user) {
		int id=  service.addUser(user);
	}

	@GetMapping(value = "/get/{userid}", produces = "application/json")
	public User getUser(@PathVariable int userid) {
		return service.getUser(userid);
	}

	@GetMapping(value = "/getUsers", produces = "application/json")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return service.getAllUsers();
	}

	@GetMapping(value = "/auth", produces = "application/json")
	public User authenticate(@RequestParam("email") String  email, @RequestParam("passwd") String passwd) {
		Login login = new Login(email, passwd);
		return service.authenticate(login);
	}


}
