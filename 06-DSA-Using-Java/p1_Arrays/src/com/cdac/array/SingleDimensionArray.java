package com.cdac.array;

public class SingleDimensionArray {

	int arr[] = null;

	// create new array of size `sizeOfArray`
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

//	visit all elements / initialize array with random numbers
	public void Display() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print('\n');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	insert values
	public void insertValue(int index, int value) {
		try {
			
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("Inserted Successfully");
			} else {
				System.out.print("Failed to Insert " + value + " at index " + index);
				System.out.println(" Reason: Already Occupied");
			}
		} catch (ArrayIndexOutOfBoundsException aout) {
			System.out.println("Outta Range");
		}
	}
	// t c: O(1)
	// s c: O(1)
	
// 	search values
	public void searchValue(int valueToSearch) {
		boolean notFound = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSearch) {
				notFound = false;
				System.out.println("Found Element " + valueToSearch +  " at index : " + i);
				return;
			}
		}
		
		if (notFound) {
			System.out.println("Element " + valueToSearch + " Not Found");
		}
	} 
	// t c: O(1)
	// s c: O(N)
	
// Delete Values
	public void deleteValue(int index) {
		try {
			arr[index] = Integer.MIN_VALUE;
			System.out.println("Deletion Successfull");
			Display();
		} catch(Exception e) {
			System.out.println("Some Error Occured");
		}
	}
	// t c: O(1)
	// s c: O(N)
}
