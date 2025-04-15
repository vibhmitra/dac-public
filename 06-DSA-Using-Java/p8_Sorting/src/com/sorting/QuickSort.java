package com.sorting;

import java.util.Arrays;

class QuickSort {
	
	public static void swap(int [] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
	
	public static int pivot(int [] arr, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		for (int i = pivotIndex + 1; i < endIndex; i++) {
			if (arr[i] < arr[pivotIndex]) {
				swapIndex++;
				swap(arr, swapIndex, i);
			}
		}
		swap(arr, pivotIndex, swapIndex);
		return (swapIndex );
	}
	
	public static void quickSortHelper(int [] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = pivot(arr, left, right);
			quickSortHelper(arr, left, pivotIndex - 1);
			quickSortHelper(arr, pivotIndex + 1, right);
		}
		return;
	}
	
	public static void quickSort(int [] arr) {
		quickSortHelper(arr, 0, arr.length - 1);
	}

	public static void main(String args[]) {
		int arr[] = { 7, 9, 4, 8, 3, 2, 10 };
		
		System.out.println("Pivot : " + pivot(arr, 0, arr.length));
		quickSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	
	}
}
