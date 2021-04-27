package com.ibm.ott;

public interface Subscribing {
	
	void  subscriber(String plan, User user) throws SubscriptionException;
		

}
