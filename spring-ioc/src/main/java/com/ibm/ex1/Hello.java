package com.ibm.ex1;

public class Hello {

	private String message;
	
	public Hello() {
		System.out.println("Default Constructors");
	}
	
	public Hello(String message) {
		this.message = message;
		System.out.println("Parameterized Constructors");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter Method");
	}
	
	
	
}
