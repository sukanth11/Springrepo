package com.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements IShape{

	@Override
	public void area(int x, int y) {
		System.out.println("rectangle "+(x*y));
		
	}
	

}
