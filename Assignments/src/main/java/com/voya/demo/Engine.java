package com.voya.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	double capacity;
	String type;
	/**
	 * @return the capacity
	 */
	public double getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	@Value("${vehicle.engine.capacity}")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	@Value("${vehicle.engine.type}")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	

}
