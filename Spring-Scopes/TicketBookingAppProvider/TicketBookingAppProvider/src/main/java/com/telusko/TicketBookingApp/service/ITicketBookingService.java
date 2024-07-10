package com.telusko.TicketBookingApp.service;

import com.telusko.TicketBookingApp.model.Passenger;

public interface ITicketBookingService 
{
	public Passenger registerPassenger(Passenger passenger);
	public Passenger fetchPassengerInfo(Integer id);

}
