package com.mandal.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int id;
	private String brand;
	public Laptop(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}

	public void compile() {
		System.out.println(">>>Compiling laptop...");
	}
}
