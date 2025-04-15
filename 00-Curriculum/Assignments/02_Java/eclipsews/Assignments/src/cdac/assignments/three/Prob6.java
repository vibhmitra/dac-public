/* Problem 6 : 	Write a java program to check whether two array are equal are not.
*				Declare an empty array and store the element in array at run time.
* 				arr1[ ] = {1, 2, 5, 4, 5};
*          		arr2[ ] = {1, 2, 5, 4, 5};
*	 			Output: Both array are equal
* 				arr1[ ] = {1, 2, 5, 4, 6};
*          		arr2[ ] = {1, 2, 5, 3, 5};
*	 			Output: Both array are not equal
*/

package cdac.assignments.three;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {

		int index, size = 5;
		boolean isEqual = true;

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		Scanner userIn = new Scanner(System.in);

		System.out.print("Enter Elements in Array 1 [] > ");
		for (index = 0; index < size; index++) {
			arr1[index] = userIn.nextInt();
		}

		System.out.print("Enter Elements in Array 2 [] > ");
		for (index = 0; index < size; index++) {
			arr2[index] = userIn.nextInt();
		}

		// Compare Logic
		for (index = 0; index < size; index++) {
			if (arr1[index] != arr2[index]) {
				isEqual = false;
				break;
			}
		}

		// Printing Arrays
		System.out.print("Array 1 : ");
		for (index = 0; index < size; index++) {
			System.out.print(arr1[index] + " ");
		}
		System.out.println();

		System.out.print("Array 2 : ");
		for (index = 0; index < size; index++) {
			System.out.print(arr2[index] + " ");
		}
		System.out.println();

		if (isEqual == true)
			System.out.println("RESULT > ARRAYS ARE EQUAL.");
		else
			System.out.println("RESULT > ARE NOT EQUAL.");
		
		userIn.close();
	}

}
