package com.telusko.SpringScProj1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> 
{

	Users findByName(String name);
}
