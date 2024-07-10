package com.telusko.TicketBookingApp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.dao.ITicketRepo;
import com.telusko.TicketBookingApp.service.ITicketBookingService;

@Service
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TicketService 
{
	
	@Autowired
	private ITicketRepo repo;
	
	
	
	public TicketService()
	{
		System.out.println("Ticket service bean created");
	}
	
	
	public void someMessage()
	{
		System.out.println(" Repo hashcode : "+repo.hashCode());
		long count=repo.count();
		System.out.println("Number of records "+ count);
	}

}
