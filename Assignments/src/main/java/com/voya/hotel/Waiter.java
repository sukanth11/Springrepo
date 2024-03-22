package com.voya.hotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	@Qualifier("indian")
	private IFoodMenu foodMenu;
	
	@Autowired
	@Qualifier("italian")
	private IFoodMenu foodMenu1;
	
	@Autowired
	IFoodMenu chinese;

	List<String> viewMenuCard(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("c"))
			menuList=chinese.showMenu();
		if(choice.equals("i"))
			menuList=foodMenu.showMenu();
		if(choice.equals("it"))
			menuList=foodMenu1.showMenu();
		return menuList;
	}

	
}
