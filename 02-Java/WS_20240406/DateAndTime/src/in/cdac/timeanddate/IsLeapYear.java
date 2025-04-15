package in.cdac.timeanddate;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class IsLeapYear {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		if (currentDate.isLeapYear())
			System.out.println("Yep! " + currentDate.getYear() + " is a Leap Year. :)");
		else
			System.out.println("Nah!! " + currentDate.getYear() + " is a Leap Year. :)");

		Calendar cal = Calendar.getInstance();		// Gregorion Cal
		System.out.println("Calendar's toString() : " + cal);
		
		System.out.println("\n\ncal.getTimeZone() : " + cal.getTimeZone());
		
		Date date = cal.getTime();
		System.out.println("cal.getTime() as object of Date Class : " + date);
		
		// Manipulation
		Calendar tempCal;
		tempCal = (Calendar) cal.clone();
		
		tempCal.add(Calendar.HOUR_OF_DAY, 10);
		System.out.println("After 10 Hours > " + tempCal.getTime());
		
		tempCal.add(Calendar.DAY_OF_YEAR, -365);
		System.out.println("Before 365 Days : " + tempCal.getTime());
		
		int maxYear = cal.getActualMaximum(cal.YEAR);
		System.out.println("Actual Maximum Year in \"" + cal.getCalendarType() + " Calender\" is : " + maxYear);
		
	}

}
