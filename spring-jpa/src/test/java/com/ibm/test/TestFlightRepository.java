package com.ibm.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;



@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestFlightRepository {
	
	@Autowired
	private FlightRepository rep;
	
	@Test
	public void testSave() {
		Flight f = new Flight("134YT", "Golu", "Dholakpur", "Kingfisher");
		assertNotNull(rep.save(f));
		System.out.println(f);
	}
	
	@Test
	public void testFetch() {
		Flight f = rep.fetch("134YT");
		assertNotNull(f);
		System.out.println(f);
	}
	
	@Test
	public void testFetchAll() {
		List<Flight> f = rep.fetchAll();
		assertNotNull(f);
		f.forEach(System.out::println);
	}
	
	@Test
	public void testUpdate() {
		Flight f = new Flight("134YT", "Hogwards", "Bhopal", "Kingfisher");
		assertTrue(rep.update(f));
	}
	
	@Test
	public void testFindByCarrier() {
		List<Flight> f = rep.findByCarrier("Kingfisher");
		assertNotNull(f);
		f.forEach(System.out::println);
	}
	
	@Test
	public void testRemove() {
		assertTrue(rep.remove("134YT"));
	}
	
	
	
	

}
