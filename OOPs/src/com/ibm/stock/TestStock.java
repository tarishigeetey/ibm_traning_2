package com.ibm.stock;

public class TestStock {

	public static void main(String[] args) {
		//Stock ibm = new Stock();
		Holder h = StockSingleton.getStock();
		h.view();
		
		Broker b =  StockSingleton.getStock();
		b.get();
		b.view();
		
		Exchange e =  StockSingleton.getStock();
		e.view();
		e.set();
		e.get();
		
		
		System.out.println(h == b);
	}

}
