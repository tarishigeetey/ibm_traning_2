package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Product;

public class ProductDao {

	EntityManagerFactory factory;
	
	public ProductDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
		
	}
	
	public int addProduct(Product p) {
		EntityManager  em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(p);
		txn.commit();
		em.close();
		return p.getPid();
	}
	public Product findProduct(int id) {
		EntityManager em = factory.createEntityManager();
		Product p = em.find(Product.class, id);
		return p;
		}
	
	public Product udateProduct(Product p) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.merge(p);
		txn.commit();
		em.close();
		return p;
	}
}
