/* PROBLEM 7 : Temperature conversion*/

package cdac.assignments.one;

import java.util.Scanner;

public class Prob7 {

	// METHOD TO CONVERT TEMPERATURE
	static double temperatureConversion (int tempType, double temperature) {
		switch (tempType) {
			case 1:
				return ((temperature - 32.0) * (5.0/9.0));
			case 2:
				return ((temperature * (9.0/5.0)) + 32.0);
			default:
				return (-1);
		}	
	}
	
	public static void main(String[] args) {

		double temperature = 0.0;
		int userChoice;
		
		Scanner getInput = new Scanner(System.in);
		
		// MENU
		System.out.println("< TEMPERATURE CONVERTOR > ");
		System.out.println("[1] FAHRENHEIT -> CELCIUS");
		System.out.println("[2] CELCIUS -> FAHRENHEIT");
		System.out.print("\nEnter Choice (1 or 2) > ");
		
		userChoice = getInput.nextInt(); 		// GETTING CHOICE
		
		// PRINTING CONVERTED TEMPERATURE
		if (userChoice == 1) {
		    System.out.print("ENTER TEMPERATURE IN FAHRENHEIT > ");
		    temperature = getInput.nextDouble();
		    System.out.print("TEMPERATURE IN CELCIUS > " + String.format("%.2f", temperatureConversion(userChoice, temperature)));
		} else if (userChoice == 2) {
		    System.out.print("ENTER TEMPERATURE IN CELCIUS > ");
		    temperature = getInput.nextDouble();
		    System.out.print("TEMPERATURE IN FAHRENHEIT > " + String.format("%.2f", temperatureConversion(userChoice, temperature)));
		}
		else
			System.out.println("Wrong Input!");
		
		getInput.close();
		
	}

}
