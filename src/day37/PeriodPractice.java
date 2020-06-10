package day37;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class PeriodPractice {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// Period - dates
		// Duration - times
		Period teen = Period.of(17, 9, 1);
		
		LocalDateTime todayPlusTeen = now.plus(teen);
		System.out.println(todayPlusTeen);
		
		System.out.println("-------------------");
		
		
		LocalDate johnsBurthday = LocalDate.of(1989, 03, 26);
		LocalDate nowDate = LocalDate.now();
		Period periodOfLive = Period.between(johnsBurthday, nowDate);
		System.out.println(periodOfLive.getYears());
		System.out.println(periodOfLive.getMonths());
		
		long totalDays = ChronoUnit.DAYS.between(johnsBurthday, nowDate);
		System.out.println("Total days: " + totalDays);
		
		LocalDateTime johnsBurthday2 = LocalDateTime.of(1989, 03, 26, 12, 0, 0);
		LocalDateTime nowDate2 = LocalDateTime.now();
		
		long totalHours = ChronoUnit.HOURS.between(johnsBurthday2, nowDate2);
		System.out.println("Total hours: " + totalHours);
	}
}
