package com.voya.hotel;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.hotel");
		Waiter waiter=(Waiter)context.getBean("waiter");
		List<String> foodItems=waiter.viewMenuCard("in");
		for(String foodItem:foodItems) {
			System.out.println("-----Menu Card-----");
			System.out.println(foodItem);
		}
	}

}
