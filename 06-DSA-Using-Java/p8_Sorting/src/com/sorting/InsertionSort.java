package com.sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i], j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] myArray = { 30, 90, 0, 80, 40, 50, 10, 20, 70 };

		insertionSort(myArray);
		printArray(myArray);
	}
}