package com.voya.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.auto");
		Performance performance=(Performance)context.getBean("performance");
		performance.playMusic("v", "Ee sundara beladingala");

	}

}
