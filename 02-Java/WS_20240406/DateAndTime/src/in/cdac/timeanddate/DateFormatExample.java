package in.cdac.timeanddate;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);		// Automatically to toString()
		
		DateFormat formatter = DateFormat.getInstance();		// Date and Time Instance
		String dateStr = formatter.format(now);
		System.out.println(dateStr);
		
		formatter = DateFormat.getDateInstance();
		System.out.println(formatter.format(now));
		
		// locale
		formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRANCE);
		System.out.println(formatter.format(now));
		
		LocalTime currentTime = LocalTime.now();
		LocalDate localDate = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(currentTime);
		System.out.println(localDate);
		System.out.println(ldt);
		
		// parsing
		String dateString = "12-10-2016 11:10:00";
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime parseDateTime = LocalDateTime.parse(dateString, formatter2);
		System.out.println(parseDateTime);
	}

}
