package com.ibm.lib;

public class TestLiberary {
	public static void main(String[] args) {
		
	Book bk = new Book(1234, "The Alchemist");
	//Book bk2 = new Book(123, "Harry Potter");
	Member mbr = new Member(99, "Polo");
	Member mbr2 = new Member(100, "Golu");
	
	
	try {
		bk.returnBook(mbr);
	} catch (LiberaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		bk.issueBook(mbr);
	} catch (LiberaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		bk.issueBook(mbr2);
	} catch (LiberaryException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}

}
}