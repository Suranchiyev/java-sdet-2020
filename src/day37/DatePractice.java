package day37;

import java.time.LocalDate;
import java.time.Month;

public class DatePractice {
	public static void main(String[] args) {
		// current date 
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);
		
		LocalDate birthDay = LocalDate.of(1990, Month.MARCH, 05);
		System.out.println("Birthday: " + birthDay);
		
		System.out.println("Day of week: " + birthDay.getDayOfWeek());
		System.out.println("Was it Leap yeat: " + birthDay.isLeapYear());
		System.out.println("ERA: " + birthDay.getEra());
		
		birthDay = birthDay.plusMonths(6);
		System.out.println("Birthday after 6 months: " + birthDay);
		
		birthDay = birthDay.plusYears(5);
		System.out.println("After 5 years: " + birthDay);
		
		System.out.println(today.isAfter(birthDay));
	}
}
