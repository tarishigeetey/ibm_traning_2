package com.ibm.customer;


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("Polo", 100.99);
		c.print();
		
		LoyalCustomer lc = new LoyalCustomer("Ellen", 100.89, 54.1);
		lc.print();
		NewCustomer nc = new NewCustomer("John", 100, 20);
		nc.print();
	}

}
