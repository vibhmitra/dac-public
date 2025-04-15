package in.cdac.timeanddate;

import java.text.SimpleDateFormat;
import java.util.*;
public class DateClassExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Current Datre : " + date);
		
		
		// simple date format
		// E (day of week) : 3X
		// M -> months
		// h -> hour
		// m -> minute
		// s -> seconds
		// a -> AM/PM
		// z -> zone
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("E, y-MM-dd hh:mm:ss a z");
		System.out.println("Date Formatted : " + dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE, MMMM, y-MM-dd hh:mm:ss a z");
		System.out.println("Date Formatted : " + dateFormat2.format(date));
		
	}

}
