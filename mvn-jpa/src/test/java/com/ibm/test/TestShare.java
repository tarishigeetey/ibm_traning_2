package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.PortfolioDao;

public class TestShare {

private static PortfolioDao dao ;
	
	@BeforeAll
	public static void init(){
		dao = new PortfolioDao();
	}
	
	@Test
	public void testAddPortfolio() {
		assertNotNull(dao.addPortfolio(1));
	}
	
	@Test
	public void testGetPortfolio() {
		System.out.println(dao.getPortfolio(1));
	}
}
