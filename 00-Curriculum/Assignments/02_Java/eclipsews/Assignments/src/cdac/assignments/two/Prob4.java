/* Problem 4:  Write a java program to print the element of an array in ascending order. */

package cdac.assignments.two;

import java.util.Arrays;

public class Prob4 {

    public static void main(String[] args) {
        int [] myArray = {4,3,2,5,1};

        System.out.print("Array Before Sorting in Ascending Order > \t");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        // sorting array using in-built class 'Arrays'
        Arrays.sort(myArray);

        System.out.print("\nArray After Sorting in Ascending Order > \t");
        for (int i : myArray) {
           System.out.print(i + " ");
       }
    }
}