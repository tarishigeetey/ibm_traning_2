package com.ibm.customer;


public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	
	private static int autogen = 101;
	
	
	public Customer(String custName, double creditLimit) {
		this.custId = autogen++;
		this.custName = custName;
		this.creditLimit = creditLimit;
		
	}
	
	public void print() {
		System.out.println("Customer Id: " + custId + " Customer Name: " + custName + " Credit Limit: " + creditLimit);
	}
	
	
	
	
}
