package com.ibm.xe;

public class CurrencyConvertor {
	
	public CurrencyConvertor() {
	}
	
	public double convert(Currency source, Currency target, double amount) {
		double rate = target.dollarValue() / source.dollarValue();
		return rate * amount;
	}
}
