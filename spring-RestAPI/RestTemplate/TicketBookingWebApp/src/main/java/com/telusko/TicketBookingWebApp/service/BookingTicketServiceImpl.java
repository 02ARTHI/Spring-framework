package com.telusko.TicketBookingWebApp.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telusko.TicketBookingWebApp.reqres.Passenger;
import com.telusko.TicketBookingWebApp.reqres.Ticket;

@Service
public class BookingTicketServiceImpl implements IBookingTicketService {

	public String BOOKING_URL="http://localhost:9090/ticket/api/book-ticket/getTicketNumber";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		RestTemplate rest = new RestTemplate();
		
		ResponseEntity<Ticket> responseEntity = rest.postForEntity(BOOKING_URL, passenger, Ticket.class);
		return responseEntity.getBody();
	}

	@Override
	public Ticket getFullTicketInfo(int ticketNumber) {
		RestTemplate rest = new RestTemplate();
		String GET_URL="http://localhost:9090/ticket/api/book-ticket/getTicket/{ticketNumber}";
		Ticket ticket = rest.getForObject(GET_URL, Ticket.class, ticketNumber);
		return ticket;
	}

}
