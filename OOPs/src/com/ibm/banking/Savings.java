package com.ibm.banking;

public class Savings extends Account {
	//private double bal =0;
	
	public Savings(String holder) {
		super(holder, MIN_SAV_BAl);
		
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance-MIN_SAV_BAl)) {
			balance-=amount;
			txns[idx ++] = new Transaction("DR", amount, balance);
		}else {
			throw new BalanceException("Insufficient balance");
			
		}
	
	}
	

}
