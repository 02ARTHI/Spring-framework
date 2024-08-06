package com.telusko.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.telusko.model.Country;

@Service
public class CountryService 
{
    private HashOperations<String, Object, Object> opsForHash=null;

//	@Autowired
//	private RedisTemplate<String, Country> tem;
	
	public CountryService(RedisTemplate<String, Country> redisTemplate)
	{
		this.opsForHash=redisTemplate.opsForHash();
		
	}
	
	public String addCountry(Country country)
	{
		opsForHash.put("COUNTRIES", country.getNo(), country);
		return "Country Info Added";
		
	}
	
	public Collection<Object> getAllCountries()
	{
		Map<Object, Object> entries = opsForHash.entries("COUNTRIES");
		Collection<Object> countries = entries.values();
		return countries;
		
	}

}
