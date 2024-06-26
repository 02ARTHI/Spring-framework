package com.telusko.TicketBookingApp.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Passenger {

	@Id
	private int pid;
	private String name;
	private String departure;
	private String arrival;
	private String dateOfJourney;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int pid, String name, String departure, String arrival, String dateOfJourney) {
		super();
		this.pid = pid;
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}
	@Override
	public String toString() {
		return "Ticket [pid=" + pid + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
}
