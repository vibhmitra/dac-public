// Problem 1 : Write a java program to store the integer elements into an array at run time and display all the stored elements on the screen.
package cdac.assignments.two;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		int index, size;

		Scanner userIn = new Scanner(System.in);

		System.out.println("Enter Size of Array > ");
		size = userIn.nextInt();

		int[] myArray = new int[size];

		// Getting Elements
		System.out.print("Enter Elements in Array > ");
		for (index = 0; index < size; index++) {
			myArray[index] = userIn.nextInt();
		}

		// Printing Elements Inside Array
		System.out.print("Array: ");
		for (index = 0; index < size; index++) {
			System.out.print(myArray[index] + " ");
		}
		System.out.println();
	}

}
