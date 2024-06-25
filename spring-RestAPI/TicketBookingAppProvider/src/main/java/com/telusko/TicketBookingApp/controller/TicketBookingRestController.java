package com.telusko.TicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.TicketBookingApp.model.Passenger;
import com.telusko.TicketBookingApp.model.Ticket;
import com.telusko.TicketBookingApp.service.ITicketService;

@RestController
@RequestMapping("/api/book-ticket")
public class TicketBookingRestController {

	@Autowired
	private ITicketService service;
	
	@PostMapping("/getTicketNumber")
	public ResponseEntity<Ticket> register(@RequestBody Passenger pass)
	{
		Passenger passenger = service.register(pass);
		Ticket tic = new Ticket();
		tic.setTicketNumber(pass.getPid());
		return new ResponseEntity<Ticket>(tic,HttpStatus.OK);
	}
	
	@GetMapping("/getTicket/{ticketNumber}")
	public ResponseEntity<Ticket> getTicketNumber(@PathVariable("ticketNumber") int ticketNumber)
	{
		
		Ticket tic = new Ticket();
		Passenger passenger = service.fetch(ticketNumber);
		
		tic.setStatus("confirmed");
		tic.setTicketcost(455879.5);
		tic.setName(passenger.getName());
		tic.setDeparture(passenger.getDeparture());
		tic.setArrival(passenger.getArrival());
		tic.setDateOfJourney(passenger.getDateOfJourney());
		tic.setTicketNumber(passenger.getPid());
		return new ResponseEntity<Ticket>(tic,HttpStatus.OK);
	}
}
