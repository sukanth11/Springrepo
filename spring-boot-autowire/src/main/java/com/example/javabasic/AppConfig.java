package com.example.javabasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	public Chinese getChinese() {
		return new Chinese();
	}
	
	@Bean
	@Primary
	public Indian getIndian() {
		return new Indian();
	}
	
	@Bean
	public Italian getItalian() {
		return new Italian();
	}
	
	@Bean
	public Waiter getWaiter() {
		Waiter waiter=new Waiter();
		waiter.setChinese(getChinese());
		return waiter;
	}

}
