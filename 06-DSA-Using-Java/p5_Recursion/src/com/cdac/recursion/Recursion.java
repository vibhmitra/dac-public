package com.cdac.recursion;

public class Recursion {

	// step 1- recursion function
	// step 2- base condition --> to avoid infinite loop
	// step 3- unintentional condition --> wrong input
	
	public static void main(String[] args) {
		// Factorial
		System.out.println("factorial: = " + factorial(-3));

		
		// Fibonacci series
		System.out.print("Fibonacci Series with Iteration: ");
		fibonacci_without_recursion(10);
		
		System.out.print("\nFibonacci Series with Recursion: ");
		for (int i =0; i < 10; i++)
			System.out.print(fibonacci_recursion(i) + " ");
		
	}
	
	 public static long factorial(int n)
	    {
		 	// Unintentional input
		 	if (n < 0) {
		 		System.out.println(n + " is negative.");
		 		return -1;
		 	}
		 
		 	// base condition
	        if (n >= 1)
	            return n * factorial(n - 1);
	        else
	            return 1;
	    }
	 
	 // Fibonacci w/ Iteration
	 public static void fibonacci_without_recursion(int number) {
		 int a = 0, b = 1, c = 0;
		
		 while (number > 0) {
			 System.out.print(a + " ");
			 c = a + b;
			 a = b;
			 b = c;
			 number--;
		 }
	 }
	 
	 // Fibonacci w/ Recursion
	 public static long fibonacci_recursion(int number) {
		if (number <= 1) {
			return (number);
		}
		else {
			return fibonacci_recursion(number - 1) + fibonacci_recursion(number - 2);
		}
	 }
}


