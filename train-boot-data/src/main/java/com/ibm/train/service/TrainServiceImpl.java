package com.ibm.train.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.train.entity.Train;
import com.ibm.train.exception.InvalidRequestException;
import com.ibm.train.repo.TrainRepository;


@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
	    repo.save(t);
	    return t.getTcode();
	}

	@Override
	public Train fetchTrain(int tcode) throws InvalidRequestException {
		Train t = repo.findById(tcode).orElseThrow(() -> new InvalidRequestException("Invalid Train code" + tcode));
		return t;
	}

	@Override
	public Collection<Train> getAll() {
		return repo.findAll();
	}

	@Override
	public Train delTrain(int tcode) throws InvalidRequestException{
		Train t = repo.findById(tcode).orElseThrow(() -> new InvalidRequestException("Invalid Train code" + tcode));
		if(t != null)
		     repo.deleteById(tcode);
		return t;
	}

}
