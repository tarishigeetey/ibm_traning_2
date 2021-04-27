package com.ibm.ott;

public class Movie extends Media {
	public Movie() {
	}

	public Movie(String title, String gener, boolean free) {
		super(title, gener, free);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestractionException {
		// TODO Auto-generated method stub
		super.play(user);
		System.out.println("Playing movie... " + title);
	}
	
    
}
