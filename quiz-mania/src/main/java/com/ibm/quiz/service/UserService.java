package com.ibm.quiz.service;



import com.ibm.quiz.entity.User;
import com.ibm.quiz.exception.InvalidRequestException;

public interface UserService {
      
	int addUser(User u);
	
    User fetchUser(int uid) throws InvalidRequestException;
		
	
	
}
