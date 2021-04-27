package com.ibm.ott;

public class Series extends Media {
	
	private int seasons;
	private int episodes;
	
	public Series() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Series(String title, String gener, boolean free, int seasons, int episodes) {
		super(title, gener, free);
		this.seasons = seasons;
		this.episodes = episodes;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void play(User user) throws SubscriptionException, AgeRestractionException {
		// TODO Auto-generated method stub
		super.play(user);
		System.out.println("Playinf episode 1 of season 1");
	}
	
	public void play(User user, int season, int episode) throws SubscriptionException, AgeRestractionException{
		super.play(user);
		if(season <= this.seasons && episode <= this.episodes)
			System.out.println("Playing Episode : " + episode +" of Srason " + season);
		else
			System.out.println("Cannot play requested media");
	}
	

}
