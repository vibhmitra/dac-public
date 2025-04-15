package com.cdac.aggregation;


public class ExplicitCombined {

	public static void main(String[] args) {
		
		Address a1 = new Address("City", "State", "Country");
		
		Employee e1 = new Employee(101, "Maz", a1);
		e1.display();
	}
}
