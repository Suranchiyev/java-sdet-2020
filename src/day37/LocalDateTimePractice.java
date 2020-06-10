package day37;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimePractice {
	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		// LocalDateTime
		
		// DateTimeFormatter if you want to format something 
		
		LocalDateTime now = LocalDateTime.now().minusWeeks(9).minusHours(3);
		System.out.println(now);
		
		// Print this date time in any other format using DateTimeFormatter class
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY HH:mm");
		String fDate = f.format(now);
		System.out.println(fDate);
		
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String fDate1 = f.format(now);
		System.out.println(fDate1);
	}
}
