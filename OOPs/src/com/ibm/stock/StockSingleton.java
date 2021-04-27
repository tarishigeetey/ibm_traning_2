package com.ibm.stock;

public final  class StockSingleton {
	
	private static Stock s ;
	
	private StockSingleton() {
		
	}
	
	public static Stock getStock() {
		
		if(s == null) {
			s = new Stock();
		}
		return s ;
	}

}
