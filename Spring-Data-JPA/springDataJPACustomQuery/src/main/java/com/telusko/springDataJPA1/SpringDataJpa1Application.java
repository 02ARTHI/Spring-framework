package com.telusko.springDataJPA1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	    VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
//	    service.fetchByVaccineCompany("krs").forEach(v->System.out.println(v));
//	    service.fetchByVaccineCompany("krs","cts").forEach(v->System.out.println(v));
//	    List<String> list =service.fetchByVaccinePriceRange(10,700);
//	    System.out.println(list);
	    
	    List<Object[]> vaccineInfo =service.fetchVaccineInfoByVaccineName("dolo650", "sputnik");
	    
	    for(Object[] objects:vaccineInfo)
	    {
	    	for(Object vaccine: objects)
	    	{
	    		System.out.println(vaccine+" ");
	    	}
	    	System.out.println();
	    	
	    } 	
	   
	    System.out.println(service.changeVaccinePriceByVaccineName(1000, "dolo650")); //returns no of rows affected
	    
	    System.out.println(service.deleteByVaccinePriceRange(10, 500));
	    
	    System.out.println(service.insertVaccineDetails(34,"paracetamol", "TCS", 5980));
	}

	

}
