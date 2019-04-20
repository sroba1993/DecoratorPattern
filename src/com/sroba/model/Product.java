package com.sroba.model;

public class Product {

	private String name;
	private String productType;
	private String mark;
	private int cost;
	
	
	public Product() {
		super();
	}

	public Product(String name, String productType, String mark, int cost) {
		this.name = name;
		this.productType = productType;
		this.mark = mark;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", ProductType=" + productType + ", Mark=" + mark + ", Cost=" + cost;
	}		
}