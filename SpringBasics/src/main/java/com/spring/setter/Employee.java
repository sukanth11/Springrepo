package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	private Integer employeeId;
	private String city;
	
	public String getCity() {
		return city;
	}
@Value("tumkur")
	public void setCity(String city) {
		this.city = city;
	}

	public Employee(String employeeName, Integer employeeId, String city) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeName, Integer employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	@Value("sukanth")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	@Value("10")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", city=" + city + "]";
	}
	

}
