package com.ibm.banking;

public interface Banking {
	void summary();
	void statement();
	
	void deposite(double amount);
	void withdraw(double amount) throws BalanceException;

}
