package com.ibm.ott;

public final class SubscriptonFactory {
	
	private SubscriptonFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Subscribing cresteSubscriber() {
		return new Subscription();
	}
}
