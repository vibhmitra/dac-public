package in.cdac.timeanddate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorChronoUnit {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate anyDate = LocalDate.of(2020, 9, 13);
		
		long years = ChronoUnit.YEARS.between(currentDate, anyDate);
		System.out.println("Age : " + years);

	}

}
