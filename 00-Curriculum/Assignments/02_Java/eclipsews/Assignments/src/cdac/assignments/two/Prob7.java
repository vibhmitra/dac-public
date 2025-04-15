/* Program 7: WAP to find if a given number has 8 in it or not. */

package cdac.assignments.two;

import java.util.Scanner;

public class Prob7 {
    public static boolean findEight(int number) {
    // logic to check if number has 8
        do {
            if (number % 10 == 8)
                return (true);
            else
                number /= 10;
        }while (number != 0);
        return (false);
    }

    public static void main(String[] args) {
        int userNumber;
        boolean foundEight;

        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Number to Check if its having 8 or not > ");
        userNumber = UserInput.nextInt();

        // checking if userNumber has 8 in in it
        foundEight = findEight(userNumber);

        // printing out results
        if (foundEight)
            System.out.println("Yep! " + userNumber + " has 8 in it. :)");
        else
            System.out.println("Nah! " + userNumber + " doesn't have 8 in it. :(");
    }
}
