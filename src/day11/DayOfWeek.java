package day11;

public class DayOfWeek {
	enum Day {Mon, Tue, Wed, Thur, Fri, Sat, Sun};
	
	public static void main(String[] args) {
		myWeek(Day.Mon);
		myWeek(Day.Sat);
		myWeek(Day.Wed);
	}
	
	/**
	 * Based on day print this messages:
	 * Mon - Home work day!
	 * Tue - Study day!
	 * Wed - Chill day!
	 * Thur - Study day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Java epic day!
	 */
	public static void myWeek(Day day) {
		if(day.equals(Day.Mon)) {
			System.out.println("Home work day!");
		}else if(day.equals(Day.Tue) || day.equals(Day.Thur)) {
			System.out.println("Study day!");
		}else if(day.equals(Day.Wed)) {
			System.out.println("Chill day!");
		}else if(day.equals(Day.Fri)) {
			System.out.println("Coding day!");
		}else {
			System.out.println("Java epic day!");
		}
	}
}
