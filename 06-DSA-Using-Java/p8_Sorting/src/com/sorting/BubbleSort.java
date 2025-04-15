package com.sorting;

public class BubbleSort {

	public static void bubbleSortIt(int[] arr) {
		int t = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

		System.out.print("Sorted Array : ");
		printArray(arr);
	}

	public static void printArray(int[] arr) {

		for (int elements : arr) {
			System.out.print(elements + " ");
		}
	}

	public static void main(String[] args) {
		int[] marks = { 30, 90, 0, 80, 40, 50, 10, 20, 70 };

		bubbleSortIt(marks);
	}

}
