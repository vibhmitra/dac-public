/* Problem 1: Basic Arithmetics. */
package cdac.assignments.one;
import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		double num1, num2, result = 0;
		Scanner In = new Scanner(System.in);
		
		System.out.println("NUM 1 : ");
		num1 = In.nextDouble();
		System.out.println("NUM 2 : ");
		num2 = In.nextDouble();
		
		result = num1 + num2;
		System.out.println("SUM \t\t: " + result);
		result = num1 - num2;
		System.out.println("DIFFERENCE \t: " + result);
		result = num1 * num2;
		System.out.println("PRODUCT \t: " + result);
		result = num1 / num2;
		System.out.println("DIVISION \t: " + result);
		
		In.close();
		
	}

}
