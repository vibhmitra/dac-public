package com.cdac.java_based_config;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}
}
