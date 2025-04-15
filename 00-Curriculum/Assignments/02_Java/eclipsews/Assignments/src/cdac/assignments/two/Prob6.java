/* Problem 6 : Write a java program to copy the existing array elements into another array. */

package cdac.assignments.two;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        // declaration
        int arraySize = 5;
        int[] arrayFirst = new int[arraySize];
        int[] arraySecond = new int[arraySize];

        // taking input and copying simultaneously
        Scanner UserIn = new Scanner(System.in);
        System.out.println("Enter Elements in arrayFirst (max " + arraySize + ")> ");
        for (int index = 0; index < arraySize; index++) {
            arrayFirst[index] = UserIn.nextInt();
            arraySecond[index] = arrayFirst[index];     // copying elements to second array
        }


        // Printing out output
        System.out.print("Elements in First Array > ");
        for (int element : arrayFirst) {
            System.out.print(element + " ");
        }

        System.out.println("\nCopying...");

        System.out.print("Elements in Second Array > ");
        for (int element : arraySecond) {
            System.out.print(element + " ");
        }
    }
}
