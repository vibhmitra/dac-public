package com.cdac.recursion;

public class DecimalToBinary {

	// in one go
	public static int btod(int decimalNumber) {
		if (decimalNumber == 0) {
			return 0;
		}
		int remainder = decimalNumber % 2;
		int nextNumber = decimalNumber / 2;
		
		return (remainder + 10 * btod(nextNumber));
	}
	
	// second way of doing it
	public static void btod2(int decimalNumber) {
		if (decimalNumber == 0) {
			return;
		}
		int remainder = decimalNumber % 2;
		int nextNumber = decimalNumber / 2;
		
		btod2(nextNumber);
		System.out.print(remainder);
	}

	public static void main(String[] args) {
		
		System.out.println(btod(8));
		btod2(8);
	}
}
