package com.ibm.train.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.train.exception.InvalidRequestException;
import com.ibm.train.pojo.Train;
import com.ibm.train.repo.TrainRepository;


@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
		return repo.saveTrain(t);
	}

	@Override
	public Train fetchTrain(int tcode) throws InvalidRequestException {
		Train t = repo.fetchTrain(tcode);
		if(t!= null)
			return t;
		throw new InvalidRequestException("Train does not exsist with code " + tcode);
	
	}

	@Override
	public Collection<Train> getAll() {
		return repo.fetchAll();
	}

	@Override
	public void delTrain(int tcode) throws InvalidRequestException{
		Train t = repo.fetchTrain(tcode);
		if(t != null)
			repo.delTrain(tcode);
		else
			throw new InvalidRequestException("Train does not exsist with code " + tcode);
	}

}
