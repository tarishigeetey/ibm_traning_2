package com.ibm.banking;
public class TestCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Current c = new Current("Lilli");
		System.out.println("Balance" + "\t" + "Overdraft");
		try {
			c.withdraw(3000);
		} catch (BalanceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		c.summary();
		try {
			c.withdraw(7000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.summary();
		c.deposite(2000);
		c.summary();
		c.deposite(4000);
		c.summary();
		

	}

}
