package com.ibm.banking;

public class Current extends Account {
	private double balance = INIT_CUR_BAL;
	private double overdraft = OD_LIMITS;
	private double am;
	
	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OD_LIMITS;
	}
	
	public void deposite(double val) {
			overdraft += val;
			if(overdraft > OD_LIMITS) {
				balance += overdraft - OD_LIMITS;
				overdraft = OD_LIMITS;
			}
	}
	
	public void withdraw(double val) throws BalanceException {
		am = balance + overdraft - val;
		if (am>= OD_LIMITS) {
			balance  = am - OD_LIMITS;
			overdraft = OD_LIMITS;
		}
		else {
			balance = MIN_CUR_BAL;
			overdraft = am;
		}
		
	}
	
	public void summary() {
		
		System.out.println( balance + "\t" + overdraft);
	}
	
}
