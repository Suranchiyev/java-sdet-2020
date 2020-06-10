package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePractice {
	public static void main(String[] args) {
		// LocalDate class for Date
		// LocalTime class for Time
		// LocalDateTime class this is for both
		
		LocalTime now = LocalTime.now();
		System.out.println("TIME: " + now);
		
		LocalTime afterOneHour = now.plusHours(1).plusMinutes(30);
		System.out.println("TIME: " + afterOneHour);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
		String hoursAndMinOnly = f.format(afterOneHour);
		System.out.println(hoursAndMinOnly);
		
		
	}
}
