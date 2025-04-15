package in.cdac.timeanddate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		String birthString;
		
		System.out.print("Enter you Date of Birth (DD-MM-YYYY) : ");
		birthString = userIn.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate birthDate = LocalDate.parse(birthString, formatter);
		
		Period userAge = Period.between(birthDate, LocalDate.now());
		
		System.out.println("Your are " + userAge.getYears() + " Years, " + userAge.getMonths() + " Months , " + userAge.getDays() + " Days Old :(");

		userIn.close();
	}

}





































//int day, month, year;
//
//LocalDate currentDate = LocalDate.now();
//
//Scanner userIn = new Scanner(System.in);
//
//System.out.println("DAY : ");
//day = userIn.nextInt();
//System.out.println("MONTH : ");
//month = userIn.nextInt();
//System.out.println("YEAR : ");
//year = userIn.nextInt();
//
//LocalDate birthDate = LocalDate.of(year, month, day);
//Period userAge = Period.between(birthDate, currentDate);
//
//System.out.println("Your Age is " + userAge.getYears());
//
//userIn.close();