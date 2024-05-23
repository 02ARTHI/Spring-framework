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
	    
//	    service.fetchByCost(1000).forEach(c->System.out.println(c));
//	    service.fetchByVaccineName("dolo650").forEach(c->System.out.println(c));
	   // service.fetchByCostLessThan(2000).forEach(c->System.out.println(c));
	   // service.fetchByCostBetween(10,900).forEach(c->System.out.println(c));
	    Collection<String> vaccines = new HashSet<>();
	    vaccines.add("dolo650");
	    vaccines.add("covaxin");
	    service.fetchByVaccineNameInAndCostBetween(vaccines,10,900).forEach(c->System.out.println(c));
	}

}
