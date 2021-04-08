package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMovie {

	private static MovieDao dao;
	@BeforeAll
	public static void init() {
		dao = new MovieDao();
	}
	
	@Test
	public void testAddMovie() {
		Movie m = new Movie();
		m.setTitle("Potato bhi kabhi seed thi");
		m.setRating(5.0);
		assertNotNull(dao.addMovie(m));
	}
	
	@Test
	public void testAddMultiplex() {
		Multiplex m = new Multiplex();
		m.setName("Potato");
		m.setCity("Farm");
		assertNotNull(dao.addMultiplex(m));
	}
	
	@Test
	public void testAddMovieToMultiplex() {
		assertNotNull(dao.addMovieToMultiplex(1, 52));
	}
	
	@Test
	public void testFindMovie() {
		Movie m = dao.findMovie(1);
		assertNotNull(m);
		
	}
	@Test
	public void testFindMultiplex() {
		Multiplex m = dao.finfMultiplex(52);
		assertNotNull(m);
		
	}
}
