package com.telusko.SpringScProj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.SpringScProj1.dao.UserRepo;
import com.telusko.SpringScProj1.dao.Users;

@Service
public class MyUserDetailsService implements UserDetailsService{

	//private static final UserDetails Users = null;
	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repo.findByName(username);
		if(user==null)
		{
			System.out.println("user not found");
			throw new UsernameNotFoundException("404 user not found");
		}
		
		return new UserPrinciple(user);
	}

}
