/* Problem 2: Check If A Number is Even/Odd. */
package cdac.assignments.one;
import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int num = 0;
		
//		(Scanner In = new Scanner(System.in);
//		System.out.println("ENTER NUMBER : ");
//		num = In.nextInt();
		
		try (Scanner In = new Scanner(System.in)) {
			System.out.println("ENTER NUMBER : ");
			num = In.nextInt();
		}
		System.out.println((num % 2 == 0)? (num + " IS EVEN"):(num + " IS ODD"));
	}

}
