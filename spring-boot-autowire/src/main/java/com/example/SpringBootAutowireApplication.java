package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.autowiring.ShapeFactory;
import com.example.javabasic.Waiter;

@SpringBootApplication
//@ComponentScan({"com"})
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
//	@Autowired
//	ShapeFactory shapeFactory;
	
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
//	shapeFactory.printArea("s", 20, 20);
//	shapeFactory.printArea("t", 10, 20);
//	shapeFactory.printArea("r", 10, 20);
	List<String> menus= waiter.viewMenuCard("in");
	for(String menu:menus)
		System.out.println(menu);
		
	}

}
