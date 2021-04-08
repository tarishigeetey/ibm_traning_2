package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieDao {

	EntityManagerFactory factory;
	
	public MovieDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addMultiplex(Multiplex mp) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(mp);
		txn.commit();
		em.close();
		return mp.getMpexId();
	}
	
	public int addMovie(Movie mv) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(mv);
		txn.commit();
		em.close();
		return mv.getMovieId();
	}
	
	public boolean addMovieToMultiplex(int movId, int mpexId) {
		EntityManager em = null;
		EntityTransaction txn = null;
		
		try {
			em = factory.createEntityManager();
			txn =em.getTransaction();
			txn.begin();
			Movie mv = em.find(Movie.class, movId);
			Multiplex mp = em.find(Multiplex.class, mpexId);
			
			mp.getMovies().add(mv);
			em.merge(mv);
			em.merge(mp);
			
			txn.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			txn.rollback();
			return false;
		}finally {
			em.close();
		}
		
	}
	
	public Multiplex finfMultiplex(int mpexId){
		EntityManager em = factory.createEntityManager();
		Multiplex mp = em.find(Multiplex.class, mpexId);
		return mp;
	}
	
	public Movie findMovie(int movId) {
		EntityManager em = factory.createEntityManager();
		Movie mv = em.find(Movie.class, movId);
		return mv;
	}
}
