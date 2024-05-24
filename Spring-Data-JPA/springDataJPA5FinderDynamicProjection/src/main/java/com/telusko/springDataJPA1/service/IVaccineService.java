package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.view.ResultView1;
import com.telusko.springDataJPA1.view.View;

public interface IVaccineService 
{ 
	
	public <T extends View> List<T> fetchByCostLessThan(int cost, Class<T> cls);
}
