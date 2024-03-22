package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private  String username;
	private String  password;
	private Integer  userId;
	private String email;
	private List<String> roles;
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(String username, String password, Integer userId, String email, List<String> roles) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
		this.email = email;
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getroles() {
		return roles;
	}
	public void setroles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", userId=" + userId + ", email=" + email
				+ ", roles=" + roles + "]";
	}
	
	

}
