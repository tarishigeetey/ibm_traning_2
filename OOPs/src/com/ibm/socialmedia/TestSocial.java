package com.ibm.socialmedia;

import java.time.LocalDate;

public class TestSocial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("Arjun");
		User u2 = new User("Bheem");
		
		Post p1 = new Post(u1, "Beautiful Day", LocalDate.now(), 100, 20);
		Post p2 = new Post(u2, "Life is beautiful", LocalDate.now(), 290,50);
		
		Comment c1 = new Comment(u2,"Yes it is");
		Comment c2 = new Comment(u2, "No its not");
		
		
		
		try {
			p1.addComment(c1);
		}catch (NoPostFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			p1.addComment(c2);
		}  catch (NoPostFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		Dashboard d = new Dashboard();
		d.addPost(p1);
		d.addPost(p2);
		d.postDisplay();

		
		

	}


}
