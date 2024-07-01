package com.telusko.TicketBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.TicketBookingApp.model.Passenger;

public interface ITicketRepo extends JpaRepository<Passenger, Integer> 
{

}
