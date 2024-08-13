package com.telusko.REST1.service;

import com.telusko.REST1.controller.Tourist;

public interface IGreetingService {
	
	public String generateSomeWish();
	public boolean welcomeTourist(Tourist tourist);

}
