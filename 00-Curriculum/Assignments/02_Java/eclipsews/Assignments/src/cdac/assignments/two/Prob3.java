/* Problem 3: Write a java program to find the second-largest element of an array. */

package cdac.assignments.two;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        // declaration
        int arraySize = 5;
        int[] myArray = new int[arraySize];
        int maxElement, secondLargeElement;

        maxElement = secondLargeElement = 0;
        Scanner userIn = new Scanner(System.in);

        // Input
        System.out.println("Enter Elements in Array (max 5) > ");
        for (int aIndex = 0; aIndex < arraySize; aIndex++) {
            myArray[aIndex] = userIn.nextInt();
            if (maxElement < myArray[aIndex])
                maxElement = myArray[aIndex];
        }

        // Process
        //secondLargeElement = maxElement - 1; not working
        // logic for second largest lol
        for (int aIndex = 0; aIndex < arraySize; aIndex++) {
            System.out.print(myArray[aIndex] + " ");
            if (secondLargeElement < myArray[aIndex] && maxElement != myArray[aIndex])
                secondLargeElement = myArray[aIndex];
        }

        // Printing Output
        System.out.println("\nThe Second Largest Element is =) " + secondLargeElement);
    }
}