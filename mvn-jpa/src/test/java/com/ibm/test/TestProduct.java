package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ibm.dao.ProductDao;
import com.ibm.entity.Product;

public class TestProduct {

private static ProductDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new ProductDao();
	}
	
	@Test
	public void testAdd() {
		Product p = new Product();
		p.setName("Potato Chips");
		p.setPrice(100);
		assertNotEquals(0, dao.addProduct(p));
	}
	@Test
	public void testFind() {
		Product p = dao.findProduct(18);
		assertNotNull(p);
		System.out.println(p);
	}
	
	@Test
	public void testupdate() {
		Product p = new Product();
		p.setPid(18);
		p.setName("Bannana Chips");
		p.setPrice(200);
		
		assertNotNull(dao.udateProduct(p));
		System.out.println(p);
	}

}
