package com.telusko.TicketBookingWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.TicketBookingWebApp.reqres.Passenger;
import com.telusko.TicketBookingWebApp.reqres.Ticket;
import com.telusko.TicketBookingWebApp.service.IBookingTicketService;



@Controller
public class TicketBookingController {

	@Autowired
	public IBookingTicketService service;
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model)
	{
		Ticket Ticket = service.bookTicket(passenger);
		model.addAttribute("ticketNumber",Ticket.getTicketNumber());
		return "index";
	}
	
	@GetMapping("/form")
	public String getForm(Model model)
	{
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
}
