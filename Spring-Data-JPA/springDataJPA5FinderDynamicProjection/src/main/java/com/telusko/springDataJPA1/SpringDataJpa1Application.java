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
import com.telusko.springDataJPA1.view.ResultView3;



@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	    VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
	    service.fetchByCostLessThan(2000,ResultView3.class).forEach(v->System.out.println(v.getCost()));
   }

}
