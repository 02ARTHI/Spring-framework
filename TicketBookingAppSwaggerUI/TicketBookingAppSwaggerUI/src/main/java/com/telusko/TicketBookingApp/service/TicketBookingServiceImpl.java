package com.telusko.TicketBookingApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.dao.ITicketRepo;
import com.telusko.TicketBookingApp.model.Passenger;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService 
{
	@Autowired
	private ITicketRepo repo;

	@Override
	public Passenger registerPassenger(Passenger passenger) 
	{
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassengerInfo(Integer id) 
	{
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}
