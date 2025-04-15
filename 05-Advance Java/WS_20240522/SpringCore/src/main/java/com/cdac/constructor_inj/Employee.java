package com.cdac.constructor_inj;

public class Employee {
	private int id;	// dependency
	private String name; // dependency
	private Address address; // Address dependency
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println(id + " " + name + " , " + address);
	}
}
