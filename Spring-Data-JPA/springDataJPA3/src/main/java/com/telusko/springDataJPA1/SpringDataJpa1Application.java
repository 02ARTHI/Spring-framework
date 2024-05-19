package com.telusko.springDataJPA1;



import java.util.ArrayList;
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
		    
		service.fetchDetails(false, "vaccineName", "vaccineCompany").forEach(c-> System.out.println(c.getVaccineName()+" : "+c.getVaccineCompany()));
		service.fetchDetails(0, 2, true, "vaccineName").forEach(c-> System.out.println(c.getVaccineName()+" : "+c.getVaccineCompany()));
		service.fecthDetailsPagenation(1);
	}

}
