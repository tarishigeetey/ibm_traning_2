package com.ibm.train.service;

import java.util.Collection;

import com.ibm.train.exception.InvalidRequestException;
import com.ibm.train.pojo.Train;

public interface TrainService {

	int addTrain(Train t);
	
	Train fetchTrain(int tcode) throws InvalidRequestException;
	
	Collection<Train> getAll();
	
	void delTrain(int tcode) throws InvalidRequestException;
}