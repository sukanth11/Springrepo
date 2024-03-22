package com.productapp.model;

public class Product {
	private Integer productId;
	private String productName;
	private String brand;
	private double price;
	private String category;
	

	public Product(String productName, String brand, double price, String category) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.category = category;
	}

	public Product(Integer productId, String productName, String brand, double price, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.category = category;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
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
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + ", category=" + category + "]";
	}
	
	
	

}
