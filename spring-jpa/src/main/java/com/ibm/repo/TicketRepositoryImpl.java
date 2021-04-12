package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Passenger;
import com.ibm.entity.Ticket;


@Repository
public class TicketRepositoryImpl implements TicketRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional(value = TxType.REQUIRED)
	public int createTicket(Ticket t) {
		em.persist(t);
		return t.getPnr();
	}


	@Transactional
	public boolean removeTicket(int pnr) {
		Ticket t = em.find(Ticket.class, pnr);
		em.remove(t);
	    return true;
	}

	@Transactional
	public boolean updateTicket(Ticket t) {
		em.merge(t);
		return true;
	}

	@Transactional
	public boolean updatePassenger(Passenger p) {
		em.merge(p);
		return true;
	}

	public List<Ticket> fetchAll() {
		return em.createNamedQuery("allTickets").getResultList();
	}

	public List<Ticket> fetchByPnr(int pnr) {
		return em.createNamedQuery("findByPnr").setParameter("pnr", pnr).getResultList();
	}


	@Transactional(value =  TxType.REQUIRED)
	public int addPassenger(Passenger p, int pnr) {
		Ticket t= em.find(Ticket.class, pnr);
		p.setTicket(t);
		em.persist(p);
		return p.getId();
	}

}
