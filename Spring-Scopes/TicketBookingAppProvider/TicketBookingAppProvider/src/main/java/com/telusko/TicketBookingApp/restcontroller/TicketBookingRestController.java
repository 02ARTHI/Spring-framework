package com.telusko.TicketBookingApp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
import com.telusko.TicketBookingApp.service.ITicketBookingService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
//@Scope("request")
@Scope("session")
@RequestMapping("api/book-ticket")
@Tag(name="TicketBookingAPIS", description="APIS to book ticket and get ticket details")
public class TicketBookingRestController 
{
	@Autowired
	private ITicketBookingService service;
	
	@Autowired
	private TicketService serv2;
	
	@Autowired
	private ITicketBookingService service2;
	
	public TicketBookingRestController()
	{
		System.out.println("RestAPi ticket crontroller bean created");
		
	}
	
	@PostMapping("/getTicketNumber")
	@Operation(summary="POST operation ",description="API will accept json passenger info and will return ticket number with ticket object")
	public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger)
	{
		Passenger pass=service.registerPassenger(passenger);
		Ticket ticket=new Ticket();
		ticket.setTicketNumber(pass.getPid());
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
	@GetMapping("/getTicket/{ticketNumber}")
	@Operation(summary="GET operation ",description="API will accept tivket number and will return ticket info")
	public ResponseEntity<Ticket> getMyFullTicket(@PathVariable("ticketNumber")Integer ticketNumber)
	{
		Ticket ticket=new Ticket();
		serv2.someMessage();
		Passenger passenger=service.fetchPassengerInfo(ticketNumber);
		
		ticket.setStatus("Confirmed");
		ticket.setTicketCost(45454.4);
		ticket.setName(passenger.getName());
		ticket.setDeparture(passenger.getDeparture());
		ticket.setArrival(passenger.getArrival());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTicketNumber(passenger.getPid());
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}

}
