package com.telusko.springDataJPA1.service;

import com.telusko.springDataJPA1.dao.Vaccine;

public interface IVaccineService 
{ 
	
	public String registerVaccineInfo(Vaccine vaccineInfo);
	public Iterable registerMultipleVaccines(Iterable<Vaccine> vaccines);
	public long getVaccinesCount();
	public Boolean IdExists(int id);
	
	

}
