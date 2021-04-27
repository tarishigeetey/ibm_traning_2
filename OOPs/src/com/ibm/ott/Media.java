package com.ibm.ott;

public abstract class Media {
	
	protected String title;
	private String gener;
    private boolean free ;
    
    public Media() {
		
	}
    
    public Media(String title, String gener, boolean free) {
		this.title = title;
		this.gener = gener;
		this.free = free;
	}


	public void play(User user) throws SubscriptionException, AgeRestractionException{
		
    	if(!free && user.getSubscription() == null)
    		throw new SubscriptionException("You are not Subscribed to watch " + title);
    	else if(gener.equals("Erotic") && user.getAge() < 18 || gener.equals("Horror") && user.getAge() <= 50 && user.getAge()>=16) {
    		throw new AgeRestractionException("You are not eligible to watch  " + gener + " media");
    	}
    }
}
