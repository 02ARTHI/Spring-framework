package com.telusko.springDataJPA1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //adding this annotation is optional 
public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	public List<Vaccine> findByCost(int cost);
	public List<Vaccine> findByVaccineName(String companyName);
	public List<Vaccine> findByVaccineNameIs(String companyName);
	public List<Vaccine> findByVaccineNameEquals(String companyName);
	public List<Vaccine> findByCostLessThan(int cost);
	public List<Vaccine> findByCostBetween(int startCost,int endcost);
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines , int startCost, int endCost);
	}
