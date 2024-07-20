package com.telusko.SpringScProj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringScProj1.dao.UserRepo;
import com.telusko.SpringScProj1.dao.Users;

@Service
public class UserService {

	@Autowired
	 private UserRepo repo;
	
	public Users saveTheUser(Users user)
	{
		return repo.save(user);
	}
}
