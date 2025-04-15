package com.dynamic.fibonacci;
// iterative approach but faster | however, space complexity is same O(N)
// But we are saving a lot of function call with this shit!
public class FibonacciSeriesBottomUp {
	/**
	 *  instead of int data type we are using Integer Wrapper 
	 *  Class so that we can store null value in empty cell of an array
	 */
	static int callCounter = 0;

	public static int fibonacci(int number) {
		int[] list = new int[number + 1];	// ignoring 0 index
		list[0] = 0;	// these are fixed, you already know why!
		list[1] = 1;		// these are fixed, you already know why!
		
		for (int index = 2; index <= number; index++ ) {
			callCounter++;
			list[index] = list[index - 1] + list[index - 2];
		}
		return (list[number]);
		
	}

	public static void main(String[] args) {
			int n1 = 40;
			int n2 = 3;
			
			System.out.println("Fibonacci of " + n1 + " : " + fibonacci(n1));
			System.out.println("CallCount : " + callCounter);
	}
}
