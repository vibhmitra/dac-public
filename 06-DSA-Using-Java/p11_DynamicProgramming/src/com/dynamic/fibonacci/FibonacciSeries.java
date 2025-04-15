package com.dynamic.fibonacci;

public class FibonacciSeries {
	static int callCounter = 0;

	public static long fibonacci(long number) {
		
		callCounter++;
		if (number == 0 || number == 1 ) {
			return (number);
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
			long n1 = 7;
			long n2 = 40;
			
			System.out.println("Fibonacci of " + n1 + " : " + fibonacci(n1));
			System.out.println("CallCount : " + callCounter);
			
			System.out.println("Fibonacci of " + n2 + " : " + fibonacci(n2));
			System.out.println("CallCount : " + callCounter);
	}
}
