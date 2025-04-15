package com.self.array;


public class Main {

	public static void main(String[] args) {
		SingleDimensionArray array = new SingleDimensionArray(3);
		array.insert(10);
		array.insert(20);

		array.print();
		array.printAllSpaceInArray();
		
		array.insert(30);
		array.insert(40);
		array.print();
		array.remove(7);
		array.print();
		
		System.out.println(array.indexOf(20));
		
	}

}
