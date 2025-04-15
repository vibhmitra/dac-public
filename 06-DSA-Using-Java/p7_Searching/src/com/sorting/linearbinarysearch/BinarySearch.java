package com.sorting.linearbinarysearch;

class BinarySearch {
	boolean binarySearch(int arr[], int value) {
		int low = 0; 
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == value) {
				System.out.println(value + " Found at index " + mid + " :)");
				return (true);
			}
			if (arr[mid] < value)
				low = mid + 1;
			else
				high = mid - 1;
		}
		System.out.println("Array Ain't Contain " + value + " in it. :(");
		return (false);
	}
}
