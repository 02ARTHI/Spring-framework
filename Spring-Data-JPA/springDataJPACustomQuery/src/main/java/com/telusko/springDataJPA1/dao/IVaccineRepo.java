package com.telusko.springDataJPA1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Query("SELECT vaccineName,cost FROM Vaccine WHERE vaccineName IN(:vac1,:vac2)")
	public List<Object[]> searchVaccineInfoByVaccineName(String vac1, String vac2);
	
	@Transactional //non select operation should be under transactional which means either modified fully or no
	@Modifying
	@Query(" UPDATE Vaccine SET cost=:newCost WHERE vaccineName=:vac")
	public int updateVaccinePriceByVaccineName(int newCost, String vac);
	
	@Transactional //non select operation should be under transactional which means either modified fully or no
	@Modifying
	@Query(" DELETE FROM Vaccine WHERE WHERE cost BETWEEN :min AND :max")
	public int deleteByVaccinePriceRange(int min, int max);
	
	@Transactional //non select operation should be under transactional which means either modified fully or no
	@Modifying
	@Query(value="INSERT into vaccine_info(`id`,`vaccine_name`,`vaccine_company`,`cost`) values(?,?,?,?)", nativeQuery=true)
	public int insertVaccineDetails(int id,String vaccineName, String VaccineCompany, int cost);
}
