package com.ibm.xe;

public class TestCurrencyConverter {

	public static void main(String[] args) {
		CurrencyConvertor c =  new CurrencyConvertor();
		INR i = new INR();
		USD u = new USD();
		
		System.out.println(c.convert(u, i , 12));
	}

}
