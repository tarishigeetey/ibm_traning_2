package com.ibm.socialmedia;

public class Comment{
	
	private User user;
	private String message ;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	
	public Comment(User user, String message ) {
		this.user = user;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void toString(Post post) throws NoPostFoundException{
		if(user != null && post != null) {
			System.out.println("Comment Posted By: " + user.getName() + " -- " + this.getMessage());
		}
		else if(post == null)
			throw new NoPostFoundException("No such post found!");
	}

}
