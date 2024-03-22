package com.voya.hotel;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showMenu() {
		List<String> chinese=Arrays.asList("noodles","gobi","spring rolls","hot pot");
		return chinese;
	}
	

}
