package com.example.javabasic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Waiter {
	@Autowired
//	@Qualifier("getIndian")
	private IFoodMenu foodMenu;
	
	@Autowired
	@Qualifier("getItalian")
	private IFoodMenu foodMenu1;
	
	
	private IFoodMenu chinese;
	
	/**
	 * @param chinese the chinese to set
	 */
	public void setChinese(IFoodMenu chinese) {
		this.chinese = chinese;
	}

	public List<String> viewMenuCard(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("ch"))
			menuList=chinese.showMenu();
		if(choice.equals("in"))
			menuList=foodMenu.showMenu();
		if(choice.equals("it"))
			menuList=foodMenu1.showMenu();
		return menuList;
	}

	

	
}
