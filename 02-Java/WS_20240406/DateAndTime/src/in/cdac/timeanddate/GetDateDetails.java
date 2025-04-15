package in.cdac.timeanddate;
import java.util.*;
public class GetDateDetails {

	public static void main(String[] args) {
		
		// Calendar is abstract class so making constructor is gonna be pretty hard
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		System.out.printf("%4d/%02d/%02d %02d:%02d", year, (month + 1), date, hour, min);

	}

}
