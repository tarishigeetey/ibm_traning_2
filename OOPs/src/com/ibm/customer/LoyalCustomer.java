package com.ibm.customer;


public class LoyalCustomer extends Customer {
	
	private double discount;
	
	public LoyalCustomer(String custName, double creditLimit, double discount) {
		super(custName, creditLimit);
		this.discount = discount;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Discount: " + discount);
	}

	
	

}
