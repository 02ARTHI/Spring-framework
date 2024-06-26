package com.telusko.TicketBookingApp.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;


public class Ticket {
  
	 private int ticketNumber;
	 private String status;
	 private Double ticketcost;
	 private String name;
	 private String departure;
	 private String arrival;
	 private String dateOfJourney;
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTicketcost() {
		return ticketcost;
	}
	public void setTicketcost(Double ticketcost) {
		this.ticketcost = ticketcost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public Ticket(int ticketNumber, String status, Double ticketcost, String name, String departure, String arrival,
			String dateOfJourney) {
		super();
		this.ticketNumber = ticketNumber;
		this.status = status;
		this.ticketcost = ticketcost;
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketcost=" + ticketcost + ", name="
				+ name + ", departure=" + departure + ", arrival=" + arrival + ", dateOfJourney=" + dateOfJourney + "]";
	}
	 
	 
}
