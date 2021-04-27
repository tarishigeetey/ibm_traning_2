package com.ibm.train.service;

import java.util.Collection;

import com.ibm.train.entity.Train;
import com.ibm.train.exception.InvalidRequestException;

public interface TrainService {

	int addTrain(Train t);
	
	Train fetchTrain(int tcode) throws InvalidRequestException;
	
	Collection<Train> getAll();
	
	Train delTrain(int tcode) throws InvalidRequestException;
}