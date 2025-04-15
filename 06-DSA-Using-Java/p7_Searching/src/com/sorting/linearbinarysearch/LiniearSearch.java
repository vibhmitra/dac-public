package com.sorting.linearbinarysearch;

public class LiniearSearch {
	public boolean linearSearch(int [] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println(value + " Found At Index " + i + " :)");
				return (true);
			}
		}
		System.out.println("Array Ain't Contain " + value + " in it. :(");
		return (false);
	}
}
