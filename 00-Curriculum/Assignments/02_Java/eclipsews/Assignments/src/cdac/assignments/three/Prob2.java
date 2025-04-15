/* Problem 2: Print Sum of ODD Number */
package cdac.assignments.three;

import java.util.Scanner;
public class Prob2 {
    public static void main(String args[]) {
        int range, sum = 0;
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter Range > ");
        range = userIn.nextInt();
         
         System.out.println("Odd Number within Range are > ");
        for (int num = 1; num <= range; num++) {
            if (num % 2 != 0) {
                sum += num;
                System.out.println(num);
            }
        }
        System.out.println("Sum of ODD numebr in Range b/w 0 - " + range + " is " + sum); 
        userIn.close();
    }
}