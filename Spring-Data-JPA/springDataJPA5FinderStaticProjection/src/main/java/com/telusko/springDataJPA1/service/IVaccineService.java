package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;

public interface IVaccineService 
{ 
	
	public List<Vaccine> fetchByCost(int cost);
	public List<Vaccine> fetchByVaccineName(String companyName);
	public List<Vaccine> fetchByCostLessThan(int cost);
	public List<Vaccine> fetchByCostBetween(int startCost,int endcost);
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> vaccines , int startCost, int endCost);
	
}
