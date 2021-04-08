package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Citizen;
import com.ibm.entity.Passport;

public class CitizenPassportDao {

	private EntityManagerFactory factory;
	
	public CitizenPassportDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public Citizen addCitizen(Citizen citizen) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		
		citizen.setId(new Passport("India", 145678));
		em.persist(citizen);
		
		txn.commit();
		em.close();
		return citizen;
	}
}
