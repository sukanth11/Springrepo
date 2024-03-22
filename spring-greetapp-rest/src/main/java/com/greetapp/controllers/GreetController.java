package com.greetapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
//	http://localhost:8080/show
	@GetMapping("/show")
	public String showMessage() {
		return "great day";
	}
	
//	http://localhost:8080/say-hello/sukanth
	@GetMapping("/say-hello/{username}")
	public String sayhello(@PathVariable("username") String username) {
		return "hello "+username;
	}
	
//	http://localhost:8080/user-details?username=sukanth&&city=bengaluru
	@GetMapping("/user-details")
	public String userDetails(@RequestParam("username") String username,@RequestParam("city") String city) {
		return "welcome "+username+" from "+city;
	}
//	http://localhost:8080/show-courses
	@GetMapping("/show-courses")
	public List<String> showCourses() {
		return Arrays.asList("java","python","html","css");
	}
	

}
