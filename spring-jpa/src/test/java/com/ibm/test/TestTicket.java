package com.ibm.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;
import com.ibm.repo.TicketRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestTicket {
	
	@Autowired
	private TicketRepository ticket;
	
	@Test
	public void testCreateTicket() {
		
		Ticket t = new Ticket(1245678, LocalDate.now(), 1000);
		assertNotNull(ticket.createTicket(t));
		System.out.println(t);
		ticket.addPassenger(new Passenger("Potato", 25, "Female"), 1245678);
		
	}
	
	@Test
	public void addPassenger() {
		Passenger p = new Passenger("Mon", 21, "Male");
		ticket.addPassenger(p, 1245678);
	}
	
	@Test
	public void testRemoveTicket() {
		assertTrue(ticket.removeTicket(1245678));
	}
	
	@Test
	public void testUpdateTicket() {
		Ticket t = new Ticket(1245678, LocalDate.now(), 2000);
		assertTrue(ticket.updateTicket(t));
	}
	
//	@Test
//	public void testUpdatePassenger() {
//		Passenger p = new Passenger("Polo", 22, "Male");
//		assertTrue(ticket.updatePassenger(p));
//	}
	
	@Test
	public void testFetchAll() {
		List<Ticket> t = ticket.fetchAll();
		assertNotNull(t);
		t.forEach(System.out::println);
	}

	
//	@Test
//	public void testFetchByPnr() {
//		
//		List<Ticket> t = ticket.fetchByPnr(1234563);
//		assertNotNull(t);
//		t.forEach(System.out::println);
//	}

}
