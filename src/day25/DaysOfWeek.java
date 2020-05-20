package day25;

import java.util.ArrayList;

public class DaysOfWeek {
	public static void main(String[] args) {
		ArrayList<String> daysOfWeek = new ArrayList<>();
		daysOfWeek.add("Mon");
		daysOfWeek.add("Tue");
		daysOfWeek.add("Wed");
		daysOfWeek.add("Thur");
		daysOfWeek.add("Fri");
		daysOfWeek.add("Sat");
		daysOfWeek.add("Sun");
		
		for(int i = daysOfWeek.size() - 1; i >= 0; i--) {
			System.out.println(daysOfWeek.get(i));
		}
	}
}
