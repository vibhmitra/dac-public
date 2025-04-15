package com.dynamic.fibonacci;

public class FibonacciSeriesMemo {
	/**
	 *  instead of int data type we are using Integer Wrapper 
	 *  Class so that we can store null value in empty cell of an array
	 */
	static Integer[] memo = new Integer[100];
	static int callCounter = 0;

	public static int fibonacci(int number) {
		callCounter++;
		if (memo[number] != null) {
			return (memo[number]);
		}
		if (number == 0 || number == 1 ) {
			return (number);
		}
		memo[number] = fibonacci(number - 1) + fibonacci(number - 2);
		return (memo[number]);
	}

	public static void main(String[] args) {
			int n1 = 7;
			int n2 = 3;
			
			System.out.println("Fibonacci of " + n1 + " : " + fibonacci(n1));
			System.out.println("CallCount : " + callCounter);
			
	}
}
