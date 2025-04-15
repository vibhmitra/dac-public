package com.cdac.array;

public class Main {

	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(5);
		sda.Display();
		
		// insert operation
		sda.insertValue(0, 1);
		sda.insertValue(1, 2);
		sda.insertValue(2, 5);
		sda.insertValue(3, 4);
		sda.insertValue(4, 9);
		sda.Display();
		
		// insertion on already occupied space
		sda.insertValue(4, 6);
		
		// search operation
		sda.searchValue(5);
		sda.searchValue(0);
		
		// deletion
		sda.deleteValue(2);
		
	}

}


