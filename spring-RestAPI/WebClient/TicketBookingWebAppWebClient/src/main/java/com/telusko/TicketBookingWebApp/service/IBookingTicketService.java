package com.telusko.TicketBookingWebApp.service;

import com.telusko.TicketBookingWebApp.reqres.Passenger;
import com.telusko.TicketBookingWebApp.reqres.Ticket;

public interface IBookingTicketService {
  
	public Ticket bookTicket(Passenger passenger);
	public Ticket getFullTicketInfo(int ticketNumber);
}
