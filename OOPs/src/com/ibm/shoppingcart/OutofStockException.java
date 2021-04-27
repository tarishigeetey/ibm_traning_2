package com.ibm.shoppingcart;

public class OutofStockException extends Exception {

	public OutofStockException() {
		super();
	}
	
	public OutofStockException(String message) {
		super(message);
	}
	
}
