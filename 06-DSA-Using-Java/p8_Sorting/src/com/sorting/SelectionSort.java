package com.sorting;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		int t = 0, mimimumIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			mimimumIndex = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[mimimumIndex])
					mimimumIndex = j;

			t = arr[mimimumIndex];
			arr[mimimumIndex] = arr[i];
			arr[i] = t;
		}

		System.out.print("Sorted Array (Using Selection Sort) : ");
		printArray(arr);
	}

	public static void printArray(int[] arr) {

		for (int elements : arr) {
			System.out.print(elements + " ");
		}
	}

	public static void main(String[] args) {
		int[] marks = { 30, 90, 0, 80, 40, 50, 10, 20, 70 };

		selectionSort(marks);

	}

}
