package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Java Bean mapped to db is entity

@Entity   // to make class an Entity
@Table(name = "music_album") 
public class Album {
	
	@Id                        //  Another name for Table
	@GeneratedValue            // Autogen val
	@Column(name = "album_id") // Pk
	
	
	private int albumId;
	private String title;
	private String gener;
	private double rating;
	
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
