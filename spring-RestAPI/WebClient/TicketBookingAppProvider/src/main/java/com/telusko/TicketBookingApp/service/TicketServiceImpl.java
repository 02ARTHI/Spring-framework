package com.telusko.TicketBookingApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.dao.ITicketRepo;
import com.telusko.TicketBookingApp.model.Passenger;

@Service
public class TicketServiceImpl implements ITicketService {

	@Autowired
	private ITicketRepo repo;
	
	@Override
	public Passenger register(Passenger pass) {
		
		return repo.save(pass);
	}

	@Override
	public Passenger fetch(int id) {
		
	 Optional<Passenger> obj = repo.findById(id);
	 return obj.get();
	
	}

}
