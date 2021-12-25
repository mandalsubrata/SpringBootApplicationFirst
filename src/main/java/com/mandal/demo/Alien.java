package com.mandal.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") // By defining this annotation, Alien class wouldn'r be singleton. Every time object will get created.

public class Alien {
	private int id;
	private String name;
	private String addr;
	@Autowired
	private Laptop laptop;
	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Alien(int id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
	public Alien() {
		System.out.println("Alien obj created.....");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	public void show() {
		laptop.compile();
		System.out.println(">>>>>> in show method");
	}
}
