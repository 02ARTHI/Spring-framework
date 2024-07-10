package com.telusko.TicketBookingApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.dao.ITicketRepo;
import com.telusko.TicketBookingApp.model.Passenger;
import com.telusko.TicketBookingApp.restcontroller.TicketService;

@Service
@Scope("prototype")
public class TicketBookingServiceImpl implements ITicketBookingService 
{
	@Autowired
	private ITicketRepo repo;
	
	@Autowired
	private TicketService serv2;

	public TicketBookingServiceImpl()
	{
		System.out.println("TicketBooking service bean created");
	}
	@Override
	public Passenger registerPassenger(Passenger passenger) 
	{
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassengerInfo(Integer id) 
	{
		serv2.someMessage();
		System.out.println(" Repo hashcode : "+repo.hashCode());
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}
