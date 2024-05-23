package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IVaccineRepo;
import com.telusko.springDataJPA1.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<Vaccine> fetchByCost(int cost)
	{
		List<Vaccine> vaccines = repo.findByCost(cost);
		System.out.println(vaccines);
		return vaccines;
	}

	@Override
	public List<Vaccine> fetchByVaccineName(String companyName) {
		
		//return repo.findByVaccineName(companyName);
		//return repo.findByVaccineNameIs(companyName);

		return repo.findByVaccineName(companyName);

	}

	@Override
	public List<Vaccine> fetchByCostLessThan(int cost) {
		
		return repo.findByCostLessThan(cost);
	}

	@Override
	public List<Vaccine> fetchByCostBetween(int startCost, int endcost) {
		
		return repo.findByCostBetween(startCost, endcost);
	}

	@Override
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> vaccines, int startCost, int endCost) {
		
		return repo.findByVaccineNameInAndCostBetween(vaccines, startCost, endCost);
	}
}
