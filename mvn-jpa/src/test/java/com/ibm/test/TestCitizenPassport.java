package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CitizenPassportDao;
import com.ibm.entity.Citizen;

public class TestCitizenPassport {

	private static CitizenPassportDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new CitizenPassportDao();
	}
	
	@Test
	public void testAdd() {
		Citizen c = new Citizen();
		c.setName("Moti");
		Citizen cp = dao.addCitizen(c);
		assertNotNull(cp);
		System.out.println(cp);
		
	}
}
