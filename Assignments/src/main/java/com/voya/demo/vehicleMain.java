package com.voya.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class vehicleMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.demo");
		Vehicle vehicle=(Vehicle)context.getBean("vehicle");
		System.out.println(vehicle);

	}

}
