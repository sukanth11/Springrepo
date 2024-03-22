package com.voya.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:application.properties")
public class Vehicle {
	
	private Integer vehicleId;
	private String model;
	private String brand;
	private double price;
	
	Engine engine;
	
	public Vehicle(Engine engine) {
		super();
		this.engine = engine;
	}
	/**
	 * @return the vehicleId
	 */
	public Integer getVehicleId() {
		return vehicleId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	@Value("${vehicle.vehicleId}")
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	@Value("${vehicle.model}")
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	@Value("${vehicle.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	@Value("${vehicle.price}")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", brand=" + brand + ", price=" + price
				+ ", engine=" + engine + "]";
	}
	
	
	
	
	

}
