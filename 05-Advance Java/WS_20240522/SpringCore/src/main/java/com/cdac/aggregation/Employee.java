/**
 * In the following example we are setting values of Employee as well as 
 * Address Class via directly invoking constructor 
 * This is the traditional way of doing it.
**/

package com.cdac.aggregation;

public class Employee {
	int id;
	String name;
	Address address;	// HAS A RELATIONSHIP
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state +" " + address.country);
	}
	
	
	public static void main(String[] args) {
		// Setting values in Address by directly invoking constructor
		Address a1 = new Address("City 1", "State 1", "Country 1");
		Address a2 = new Address("City 2", "State 2", "Country 2");
		
		// setting values in Employee class directly invoking constructor
		Employee e1 = new Employee(1, "Robin", a1);
		Employee e2 = new Employee(2, "Mac", a2);
		
		// invoking methods
		e1.display();
		e2.display();
	}
}
