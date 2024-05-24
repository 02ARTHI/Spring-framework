package com.telusko.springDataJPA1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telusko.springDataJPA1.view.ResultView;

@Repository //adding this annotation is optional (it is service layer)
public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
//	@Query("FROM Vaccine WHERE vaccineCompany=:company")
//	public List<Vaccine> searchByVaccineCompany(String company);
	
	@Query("FROM Vaccine WHERE vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company") String v);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN(:comp1,:comp2)")
	public List<Vaccine> searchByVaccineCompany(String comp1, String comp2);
	
	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE cost BETWEEN :min AND :max")
	public List<String> searchByVaccinePriceRange(int min, int max);
}
