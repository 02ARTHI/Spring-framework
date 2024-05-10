package com.telusko.springDataJPA1;



import java.util.ArrayList;
import java.util.List;

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
	    
//	    Vaccine vac = new Vaccine("dolo","psg",100);
//	    System.out.println(service.registerVaccineInfo(vac));
//	                    
//	    Vaccine vac1 = new Vaccine("covaxin","cts",1000);
//	    Vaccine vac2 = new Vaccine("sputnik","krs",999);
//	    Vaccine vac3 = new Vaccine("dolo650","psg",568);
//	    
//	    List<Vaccine> vaccineList =new ArrayList<Vaccine>();
//	    vaccineList.add(vac1);
//	    vaccineList.add(vac2);
//	    vaccineList.add(vac3);
//	    
//	    service.registerMultipleVaccines(vaccineList).forEach(v->System.out.println(v));
	    System.out.println(service.getVaccinesCount());
	    System.out.println(service.IdExists(1));
	}

}
