package com.cdac.recursion;

public class SumOfDigit {

	public static int sumOfDigits(int number) {
		if (number == 0 || number < 1) {
			return 0;
		}
		
		int digit = number % 10;
		int nextNumber = number / 10;
		
		return (sumOfDigits(nextNumber) + digit);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Sum of Digits (123): " + sumOfDigits(123));
	}

}
