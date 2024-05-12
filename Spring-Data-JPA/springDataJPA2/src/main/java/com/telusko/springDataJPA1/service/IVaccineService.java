package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;

public interface IVaccineService 
{ 
	
	public String registerVaccineInfo(Vaccine vaccineInfo);
	public Iterable registerMultipleVaccines(Iterable<Vaccine> vaccines);
	public long getVaccinesCount();
	public Boolean IdExists(int id);
	public Optional<Vaccine> getVaccineById(int id);
	public String removeVaccineById(int id);
	public String removeVaccinesByIDs(List<Integer> ids);
	public String removeVaccineByObject(Vaccine vaccine);

}
