package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	@Override
	public void area(int x, int y) {
		System.out.println("triangle "+(x+y/2));
		
		
	}
	

}
