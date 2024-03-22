package com.spring.auto;

import java.awt.Shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	//autoWiring by type
	@Autowired
	@Qualifier("rectangle")
	private IShape shape;
	//autoWiring by name 
	@Autowired
	private IShape triangle;
	//autoWiring by constructor
	@Autowired
	private IShape shaper;
	
	public void setShape(IShape shape) {
		this.shape = shape;
	}
	
	void printArea(String choice,int x,int y) {
		System.out.println("printarea");
		
		if(choice.equals("r"))
			shape.area(x, y);
		if (choice.equals("t"))
			triangle.area(x, y);
		if (choice.equals("s"))
			shaper.area(x, y);
			
		
	}
}
