/* Problem 5: Write a java program to search any element from an array. If it is found then
display the number with index value.*/

package cdac.assignments.two;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        int[] myArray = {1,5,3,2,5,6,7,9,0};
        boolean isFound = false;
        int searchVar;

        System.out.print("Enter The Element you want to search for > ");
        Scanner UserIn = new Scanner(System.in);
        searchVar = UserIn.nextInt();

        for (int index = 0; index < myArray.length; index++) {
            if (searchVar == myArray[index]) {
                System.out.println(searchVar + " Found at index " + index);
                isFound = true;
            }
        }
        //  just for fun
        if (isFound == false)
            System.out.println(searchVar + " isn't available in the array. :(");
    }
}
