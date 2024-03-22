package com.voya.hotel;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		List<String> indian=Arrays.asList("dosa","idly","rice","chapathi");
		return indian;
	}

}
