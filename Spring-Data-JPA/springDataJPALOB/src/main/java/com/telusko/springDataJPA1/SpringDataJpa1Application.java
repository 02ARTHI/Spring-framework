package com.telusko.springDataJPA1;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springDataJPA1.dao.JobSeeker;
import com.telusko.springDataJPA1.service.JobServiceImpl;


@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		JobServiceImpl jobServiceImpl = container.getBean(JobServiceImpl.class);
		
		InputStream inputStream=null;
		FileReader reader =null;
		byte[] image=null;
		char[] textFile=null;
		
//		try {
//			inputStream =new FileInputStream("C:\\Users\\arthi\\OneDrive\\Desktop\\LOB\\dog.jpg");
//			image=new byte[inputStream.available()];
//			inputStream.read(image);
//			
//			File file = new File("C:\\Users\\arthi\\OneDrive\\Desktop\\LOB\\textFile.txt");
//			reader = new FileReader(file);
//			textFile= new char[(int)file.length()];
//			reader.read(textFile);
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}finally
//		{
//			try {
//				reader.close();
//				inputStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		JobSeeker job = new JobSeeker();
//		job.setCity("klr");
//		job.setName("arthi");
//		job.setDob(LocalDate.of(1999, 8, 5));
//		job.setTextFile(textFile);
//		job.setImage(image);
//		System.out.println(jobServiceImpl.registerJobSeeker(job));
		
		int id=2;
		Optional<JobSeeker> optional = jobServiceImpl.searchJobseekarInfoBy(id);
		if(optional.isPresent())
		{
			JobSeeker job=optional.get();
			System.out.println(job.getId()+" --> "+job.getName()+" , "+ job.getCity());
//			try {
//				FileOutputStream fos=new FileOutputStream("C:\\Users\\arthi\\OneDrive\\Desktop\\LOB\\Java.JPG");
//				fos.write(job.getImage());
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		else
		{
			System.out.println("there is no record with given id : "+id);
		}
		
	}

}
