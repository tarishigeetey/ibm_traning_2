package com.ibm.banking;

public class Transaction {
	private String type;
	private double amount;
	private double balance;
	// One to  Many
	public Transaction() {
		
	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public void print() {
		System.out.printf("%-10s%.2f\t%.2f\n", type, amount, balance);
	}

}
