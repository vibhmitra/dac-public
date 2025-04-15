package com.cdac.bean_scope;

public class Employee {
	String city;

	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println(city);
	}
}
