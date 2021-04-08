package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movseq")
	@Column(name = "movie_id")
	private int movieId;
	@Column(length = 30)
	private String title;
	private double rating;
	
	@ManyToMany(cascade = CascadeType.ALL )
	@JoinTable(name = "show_time", 
	         joinColumns = {@JoinColumn(name = "movie_id")},
	         inverseJoinColumns = {@JoinColumn(name = "mpex_id")})
	private Set<Multiplex> multiplexes = new HashSet<Multiplex>();

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}

	public void setMultiplexes(Set<Multiplex> multiplexes) {
		this.multiplexes = multiplexes;
	}
	
	
}
	