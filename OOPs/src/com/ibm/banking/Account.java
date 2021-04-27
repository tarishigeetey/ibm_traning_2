package com.ibm.banking;
/**
 * 
 * @author ibmjavafsdmr19 Tarishi Geetey
 * @version 1.0
 */

public abstract class Account implements Banking {
	private int  acntNo;
	private String holder;
	protected double balance;
	
	// Application constants
	public static final int INT_AC_NO = 1001;
	public static final double MIN_SAV_BAl = 1000;
	public static final double OD_LIMITS = 10000;
	public static final double INIT_CUR_BAL = 5000;
	public static final double MIN_CUR_BAL = 0;
	
	private static int autogen = INT_AC_NO;
	
	
	protected Transaction[] txns;
	protected int idx;
	
	/* Default Constructor*/
	public Account() {
		
	}
	
	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Transaction[10];
		txns[idx ++] = new Transaction("OB", balance, balance);
		}
	
	public void summary() {
		System.out.println("AcId : " + acntNo);
		System.out.println("Holder : " + holder );
		System.out.println("Balance : " + balance);
		
	}
	public void deposite(double amount) {
		this.balance += amount;
		txns[idx ++] = new Transaction("CR", amount, balance);
	}
	public abstract void withdraw(double amount) throws BalanceException;
	
	public void statement() {
		System.out.println("Statement for A/C: " + acntNo);
		for(int i =0; i< idx; i++)
			txns[i].print();
	}
	
}
