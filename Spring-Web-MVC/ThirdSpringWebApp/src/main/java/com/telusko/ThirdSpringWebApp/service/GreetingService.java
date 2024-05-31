package com.telusko.ThirdSpringWebApp.service;


import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String generateGreetings() {
		LocalDateTime datetime = LocalDateTime.now();
		int hour=datetime.getHour();
		if(hour<12)
			return"Good morning";
		else if(hour<16)
			return"Good afternoon";
		else if(hour<20)
			return"Good evening";
		else
			return"Good night";
		
	}

}
