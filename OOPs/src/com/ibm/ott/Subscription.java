package com.ibm.ott;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Subscription implements Subscribing{
	
	public static final int MONTHLY = 100;
	public static final int ANNUALY = 1000;
	private String plan;
	private LocalDate expiry;
	
	
	public Subscription() {
		// TODO Auto-generated constructor stub
	}
	public Subscription(String plan, LocalDate expiry) {
		this.plan = plan;
		this.expiry = expiry;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public void subscriber(String plan, User user) throws SubscriptionException {
		
		if(user.getSubscription() == null) {
		if(plan.equalsIgnoreCase("monthly") && user.getBalance() >= MONTHLY) {
			user.setBalance(user.getBalance() - MONTHLY);
			expiry = LocalDate.now().plus(1, ChronoUnit.MONTHS);
			user.setSubscription(this); 
			setPlan(plan);
			System.out.println("Subscribed Successfully to " + plan + " plan!!");
			
		}else if(plan.equalsIgnoreCase("annualy") && user.getBalance() >= ANNUALY){
			
			user.setBalance(user.getBalance() - ANNUALY);
			expiry = LocalDate.now().plus(1, ChronoUnit.YEARS);
			user.setSubscription(this); 
			setPlan(plan);
			System.out.println("Subscribed Successfully to " + plan + " plan!!");
			
		}
		else
			throw new SubscriptionException("Insufficient balance against subscriptionamount");
	}
		else
			throw new SubscriptionException("Already Subscribed with the " + getPlan()+" plan.");
	}

}
