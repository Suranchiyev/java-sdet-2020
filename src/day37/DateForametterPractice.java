package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateForametterPractice {
	public static void main(String[] args) {
		String actualDate = "06/09/2020";
		
		// current date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(actualDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY"); 
		String formattedDate = formatter.format(today);
		System.out.println(formattedDate.equals(actualDate));
		
		formatter = DateTimeFormatter.ofPattern("MMMM.dd.YY");
		formattedDate = formatter.format(today);
		System.out.println(formattedDate);
		
		today = today.plusMonths(4);
		formatter = DateTimeFormatter.ofPattern("YYYY, MMMM dd");
		String fMonthAfter = formatter.format(today);
		System.out.println(fMonthAfter);
		
	}
}
