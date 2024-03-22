package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GreetController {
	
	@RequestMapping("/greet")
	public String greetUser(Model model) {
		model.addAttribute("message","great Day");
		return "success";
	}
	
	@RequestMapping("/hii")
	public String sayHello(ModelMap model) {
		model.addAttribute("message","Hello!! Have a nice Day");
		return "success";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser() {
		ModelAndView modelAndView=new ModelAndView("success","message","welcome to mvc");
		return modelAndView;
	}

}
