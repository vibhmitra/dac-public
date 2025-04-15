package in.cdac.timeanddate;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class DateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentDate = LocalDate.now();
		LocalDate anyDate = LocalDate.of(2020, 9, 13);
		
		Period difference = Period.between(anyDate, currentDate);
		
		System.out.println("No of Years since " + anyDate.getYear() + " is :  " + difference.getYears() + " year(s)");
	}

}
