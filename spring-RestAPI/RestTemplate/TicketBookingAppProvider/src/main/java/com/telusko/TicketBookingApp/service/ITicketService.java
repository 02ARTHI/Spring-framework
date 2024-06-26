package com.telusko.TicketBookingApp.service;

import com.telusko.TicketBookingApp.model.Passenger;

public interface ITicketService {
  public Passenger register(Passenger pass);
  public Passenger fetch(int id);
}
