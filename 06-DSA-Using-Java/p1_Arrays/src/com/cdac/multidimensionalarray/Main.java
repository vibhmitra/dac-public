package com.cdac.multidimensionalarray;

public class Main {

	public static void main(String[] args) {
		MultidimensionalArray mda = new MultidimensionalArray(4, 4);
		mda.displayData();
		mda.cellData(2, 3);
		
		// insert op
		mda.insertData(2, 3, 8004);
		mda.insertData(0, 2, 9004);
		mda.insertData(1, 0, 4300);
		mda.insertData(3, 2, 70004);
		
		// delete op
		mda.deleteData(70004);
	}

}
