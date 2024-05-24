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
	    service.fetchByVaccinePriceRange(10,700).forEach(v->System.out.println(v));
   
	}

}
