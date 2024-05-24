package com.telusko.springDataJPA1.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springDataJPA1.view.ResultView1;
import com.telusko.springDataJPA1.view.View;

@Repository //adding this annotation is optional 
public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	public <T extends View> List<T> findByCostLessThan(int cost, Class<T> cls);
}
