package com.doctorapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@RequestMapping("admin")
	public String admin(Model  model) {
		return "login";
	}
	
	@RequestMapping("login")
	public String login(@RequestParam("adminName") String adminName,@RequestParam("password") String password) {
		if(adminName.equals("sukanth")&&password.equals("8660519965"))
			return "admin";
		return "login";
	}
	
	@RequestMapping("add-doctor-form")
	public String addDoctor(Model  model) {
		return "addDoctor";
	}
	
	@RequestMapping("edit-doctor-form")
	public String editDoctor(Model  model) {
		return "editDoctor";
	}
	
	@RequestMapping("delect-doctor-form")
	public String deleteDoctor(Model  model) {
		return "delectDoctor";
	}

}
