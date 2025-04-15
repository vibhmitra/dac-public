/* Problem 4: Print Number of Digits */
package cdac.assignments.three;

import java.util.Scanner;
public class Prob4 {
    public static void main(String args[]) {
        int input, num, digitCount = 0;
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter Nubmer > ");
        input = userIn.nextInt();
        num = input;
        while (num % 10 != 0) {
            num = num / 10;
            digitCount++;
        }
        System.out.println("Number of Digits in " +  input + " > " + digitCount);
        userIn.close();
    }
}
