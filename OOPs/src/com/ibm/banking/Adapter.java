package com.ibm.banking;
public final class Adapter {
	private Adapter() {
	}
	public static Banking openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static  Banking openCurrentAccount(String holder) {
		return new Current(holder);
	}

}
