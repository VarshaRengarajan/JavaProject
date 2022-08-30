package com.feedback.UserFeedback.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Feedback()
	{
		
	}
	public Feedback(Integer id, String comments, int rating, String user)
	{
		this.id = id;
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Feedback [comments=" + comments + ", rating=" + rating + ", user=" + user + "]";
	}
	
	
	
	
}
