/* Problem 3: WAP to calculate Simple Interest. */
package cdac.assignments.one;
import java.util.Scanner;

public class Prob3 {
	
	public static double simpleInterest(double principalAmt, double rate, int timePeriod) {
		double totalInterest = 0;
		// Simple Interest Logic
		totalInterest = (principalAmt * rate * timePeriod) / 100;
		
		return (totalInterest);
	}
	
	public static void main(String[] args) {
		Scanner cInput = new Scanner(System.in);
		double principalAmt, rate;
		int timePeriod;
		
		System.out.print("ENTER PRINCIPAL AMOUNT : ");
		principalAmt = cInput.nextDouble();
		System.out.print("ENTER RATE : ");
		rate = cInput.nextDouble();
		System.out.print("ENTER TIME PERIOD : ");
		timePeriod = cInput.nextInt();
		
		System.out.println("SIMPLE INTEREST : Rs. " + simpleInterest(principalAmt, rate, timePeriod));
		cInput.close();
	}

}
