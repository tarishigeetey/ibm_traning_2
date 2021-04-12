package com.ibm.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="ticket_generation")
@NamedQueries({@NamedQuery(query = "from Ticket", name = "allTickets")})
public class Ticket {

	@Id
	private int pnr;
	private LocalDate date;
	private double amount;
	
	@OneToMany(mappedBy = "ticket", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Passenger> passenger = new ArrayList<Passenger>();
	public List<Passenger> getPassenger() {
		return passenger;
	}
	
	

	public Ticket(int pnr, LocalDate date, double amount) {
		super();
		this.pnr = pnr;
		this.date = date;
		this.amount = amount;
	}



	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public Ticket() {
		
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", date=" + date + ", amount=" + amount + ", passenger=" + passenger + "]";
	}

	
	
}
