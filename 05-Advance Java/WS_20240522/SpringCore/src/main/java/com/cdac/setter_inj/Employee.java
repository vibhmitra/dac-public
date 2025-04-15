package com.cdac.setter_inj;


public class Employee {
	int id;
	String name;
	Address address;	// HAS A RELATION
	
// the setters for employee
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}
}
