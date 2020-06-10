package day37;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDates {
	public static void main(String[] args) {
		String someDate = "2002-02-08"; // this is default format so converting directly 
		LocalDate dateToCheck = LocalDate.parse(someDate);
		System.out.println(dateToCheck.getDayOfWeek());
		System.out.println(dateToCheck.getDayOfWeek().equals(DayOfWeek.MONDAY));
		
		String someDate2 = "June 19 1996";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd uuuu");
		LocalDate date2ToCheck = LocalDate.parse(someDate2, f);
		System.out.println(date2ToCheck.getDayOfWeek());
	}
}
