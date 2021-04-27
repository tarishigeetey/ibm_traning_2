package com.ibm.socialmedia;

import java.time.LocalDate;

public class Post {
	private User user;
	private String content;
	private LocalDate postDate;
	private int likes;
	private int dislikes;
	private Comment[] comment;
	
	private int idx;

	
	public Post() {
		// TODO Auto-generated constructor stub
	}


	public Post(User user,String content, LocalDate postDate, int likes, int dislikes) {
		this.user = user;
		this.content = content;
		this.postDate = postDate;
		this.likes = likes;
		this.dislikes = dislikes;
		
		comment = new Comment[50];
		comment[idx++] = new Comment();

	}
	
	public void addComment(Comment comment) throws NoPostFoundException {
		this.comment[idx++] = comment;
		
	}
	
	public void print() {

		System.out.println("Posted By: " + user.getName());
		System.out.println("Content: " + this.getContent());
	    System.out.println("Posted on: " + this.getPostDate());
	    System.out.println("Likes: " + this.getLikes());
	    System.out.println("Dislikes: "+ this.getDislikes());
	
	    
	    for(int i = 0; i< idx ; i++)
			try {
				comment[i].toString(this);
			}catch (NoPostFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes += likes;
	}


	public int getDislikes() {
		return dislikes;
	}


	public void setDislikes(int dislikes) {
		this.dislikes += dislikes;
	}
	
	 
	
	

}
