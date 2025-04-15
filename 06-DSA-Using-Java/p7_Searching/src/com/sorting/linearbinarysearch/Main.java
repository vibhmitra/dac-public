package com.sorting.linearbinarysearch;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {5,4,8,10,8,6,9,3,55,90};			// just for linear
		int[] arr2 = {1,2,3,5,6,7,8,9,10,34,36,45,48};	// just for binary search as it needs already sorted array
		int value = 10;
		
		LiniearSearch ls = new LiniearSearch();
		BinarySearch bs = new BinarySearch();
		
		ls.linearSearch(arr1, value);
		bs.binarySearch(arr2, value);
		
		return;
	}

}
