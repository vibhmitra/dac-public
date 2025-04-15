/* Problem 1:  Print Multiplication Table  */
package cdac.assignments.three;

import java.util.Scanner;
public class Prob1 {
   public static void main(String args[]) {
       int num;
       Scanner userIn = new Scanner(System.in);
       System.out.print("Enter A Number : ");
       num = userIn.nextInt();
       for (int i = 1; i <= 10; i++) {
           System.out.println(num + " x " + i + " = "  + (num *i));
       }
       userIn.close();
   }
}
