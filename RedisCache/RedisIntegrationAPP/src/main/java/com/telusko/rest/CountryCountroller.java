package com.telusko.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Country;
import com.telusko.service.CountryService;

@RestController
public class CountryCountroller {
	
	@Autowired
	private CountryService service;
	
	@PostMapping("/add")
	public String addCountries(@RequestBody Country country)
	{
		return service.addCountry(country);
		
	}
	
	@GetMapping("/getcountries")
	public Collection getCountries()
	{
		return service.getAllCountries();
	}

}
