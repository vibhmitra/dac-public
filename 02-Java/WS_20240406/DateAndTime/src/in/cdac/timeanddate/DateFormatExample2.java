package in.cdac.timeanddate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateFormatExample2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateStr = sdf.format(new Date());
		System.out.println(dateStr);
		
		String dateStr2 = "04/04/2024";
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");
		
//		Date date = sdf2.parse(dateStr2);
		Date d = sdf2.parse(dateStr2);
		System.out.println(d);
		
		ZoneId zoneID = ZoneId.of("America/Creston");
		LocalDateTime ldt = LocalDateTime.now(zoneID);
		
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneID);
		
		System.out.println(zdt);

	}

}
