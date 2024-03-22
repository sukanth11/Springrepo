package com.example.javabasic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class Italian implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		List<String> italian=Arrays.asList("pizza","pasta","focaccia","lasagna");
		return italian;
	}
	

}
