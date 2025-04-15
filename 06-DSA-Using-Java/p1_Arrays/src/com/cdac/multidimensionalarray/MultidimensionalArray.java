package com.cdac.multidimensionalarray;

public class MultidimensionalArray {
	int arr[][] = null;

	public MultidimensionalArray(int rows, int cols) {
		arr = new int[rows][cols];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	// Display 2D Array
	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	// print cell value
	public void cellData(int row, int col) {
		try {
			System.out.println("Data at Row#" + row + ", Col#" + col + " is : " + arr[row][col]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index Out Of Bound in print cellData");
		}
	}

	// insert data
	public void insertData(int row, int col, int data) {
		try {
			arr[row][col] = data;
			System.out.println("Insertion Successful!");
			displayData();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index Out Of Bound");
		}
	}

	// delete data
	public void deleteData(int data) {
		try {
			boolean gotDeleted = false;
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					if (arr[row][col] == data) {
						arr[row][col] = Integer.MIN_VALUE;
						gotDeleted = true;
					}
				}
			}
			if (gotDeleted) {
				System.out.println("Deletion Successfull");
				displayData();
			} else {
				System.out.println("That Element Not Found");
			}
		} catch (Exception ex) {
			System.out.println("Delete Error");
		}
	}

}
