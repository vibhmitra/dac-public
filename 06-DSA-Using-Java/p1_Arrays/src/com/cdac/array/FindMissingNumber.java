package com.cdac.array;

import java.util.Arrays;

/**This method assumes that array is already shorted and are in consecutive order **/
public class FindMissingNumber {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 8};
		int sum = 0;
		int indexSum = 1;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			indexSum += i;
		}	
		
		// o/p
		System.out.println(Arrays.toString(arr));
		System.out.println("Missing Number : " + (sum - indexSum));
	}
}

