package com.ibm.train.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ibm.train.exception.InvalidRequestException;
import com.ibm.train.pojo.Train;
import com.ibm.train.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	private TrainService service;

	@PostMapping(value = "/train" , consumes = "application/json")
	public String addTrain(@RequestBody Train train) {
		int code = service.addTrain(train);
		return "Train added with code " + code ;
	}
	
	
	@GetMapping(value = "/train/{code}", produces = "application/json")
	public Train fetchTrain( @PathVariable("code") int code) {
		Train t = null;
		try {
			t =  service.fetchTrain(code);
		} catch (InvalidRequestException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format(e.getMessage()));
		}
		return t;
	}
	@GetMapping(value = "/trains", produces = "application/json")
	public Collection<Train> fetchAll(){
		return service.getAll();
	}
	
	@DeleteMapping(value = "/train/{code}")
	public String delTrain(@PathVariable("code") int code) {
		try {
			service.delTrain(code);
		} catch (InvalidRequestException e) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Exception log : %s", e.getMessage()));			
		}
		return "Deleted successfully code : " + code;
	}
	
}
