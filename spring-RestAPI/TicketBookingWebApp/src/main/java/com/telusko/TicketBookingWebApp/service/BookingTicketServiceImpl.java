package com.telusko.TicketBookingWebApp.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telusko.TicketBookingWebApp.reqres.Passenger;
import com.telusko.TicketBookingWebApp.reqres.Ticket;

@Service
public class BookingTicketServiceImpl implements IBookingTicketService {

	@Override
	public Ticket bookTicket(Passenger passenger) {
		RestTemplate rest = new RestTemplate();
		String BOOKING_URL="http://localhost:9090/ticket/api/book-ticket/getTicketNumber";
		rest.postForEntity(BOOKING_URL, rest, Ticket.class);
		return null;
	}

	@Override
	public Ticket getFullTicketInfo(int ticketNumber) {
		
		return null;
	}

}
