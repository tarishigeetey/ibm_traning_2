package com.ibm.socialmedia;


public class Dashboard {
	
	private Post[] post ;
	private int autogen = 0;
	
	
	public Dashboard() {
		// TODO Auto-generated constructor stub
		this.post = new Post[10];
		this.post[autogen ++] = new Post();

	}
	
	public void addPost(Post post) {
		this.post[autogen ++] = post;
	}
	
	public void postDisplay() {
		for(int i= 1; i< autogen ; i++)
			post[i].print();
	}
	
	

}
