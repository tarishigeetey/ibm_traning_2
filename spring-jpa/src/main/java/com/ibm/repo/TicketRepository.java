package com.ibm.repo;

import java.util.List;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;

public interface TicketRepository {

	int createTicket(Ticket t);
	
	int  addPassenger(Passenger p, int pnr);
	
	boolean removeTicket(int pnr);
	
	boolean updateTicket(Ticket t);
	
	List<Ticket> fetchByPnr(int pnr);
	
	List<Ticket> fetchAll();

	boolean updatePassenger(Passenger p);
	
}
