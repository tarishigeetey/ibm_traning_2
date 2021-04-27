package com.ibm.lib;

public class Book {
	private int isbn;
	private String title;
	private Member member;
	
	public Book() {
		
	}
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Book(int isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	
	public void status() {
		if(member == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + member.getName());
	}
	public void issueBook(Member mr) throws LiberaryException{
		if(member != null || mr.getBook() != null) {
			throw new LiberaryException(mr.getBook()+ " Already Issued to " + mr.getName() );
		}
		else {
		this.member = mr;
		mr.setBook(this);
		}
	}
	
	public void returnBook(Member mbr) throws LiberaryException {
		if(mbr.getBook() == null || member == null || 
				member.getName().equals(mbr.getName())) {
			throw new LiberaryException("Cannot Return");
		}
		else {
		this.member = null;
		mbr.setBook(null);
		}
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
