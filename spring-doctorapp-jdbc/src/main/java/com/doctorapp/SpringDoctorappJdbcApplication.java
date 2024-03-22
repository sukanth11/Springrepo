package com.doctorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
		 System.out.println(doctorService.getById(1));
//		 doctorService.updateDoctor(2, 500);
		
	}

}
