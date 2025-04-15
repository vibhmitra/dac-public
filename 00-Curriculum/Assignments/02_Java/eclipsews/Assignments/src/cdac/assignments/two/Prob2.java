/*  Problem 2: Write a java program to print the maximum, minimum and average of all element
of an array.
 */

package cdac.assignments.two;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        int arraySize = 5;
        int[] myArray = new int[arraySize];
        int maxElement, minElement;
        double sum = 0;

        // taking input
        Scanner UserIn = new Scanner(System.in);
        System.out.println("Enter Elements in Array (max 5) > ");
        for (int aIndex = 0; aIndex < arraySize; aIndex++) {
            myArray[aIndex] = UserIn.nextInt();
        }

        // max-min-avg Logic
        minElement = myArray[0];    // setting min element as first element of array
        maxElement = 0;             // setting max element as 0;
        for (int aIndex = 0; aIndex < arraySize; aIndex++) {
            if (maxElement < myArray[aIndex])
                maxElement = myArray[aIndex];
            if (minElement > myArray[aIndex])
                minElement = myArray[aIndex];
            sum += myArray[aIndex];
        }

        // printing out the results
        System.out.println("MAX > " + maxElement);
        System.out.println("MIN > " + minElement);
        System.out.println("AVG > " + (sum / arraySize));
    }
}

