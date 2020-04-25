package day11;

public class StrCompareTo {
	public static void main(String[] args) {
		// .compareTo(String); to check the lexicographic order (ACII table) 
		
		String l = "c";
		String l1 = "a";
		
		System.out.println(l1.compareTo(l));
		// if negative number, "a" is before "c" in ACII table
		
		System.out.println(l.compareTo(l1));
		// if positive number, "c" is after "a" in ACII table
		
		l = "b";
		l1 = "b";
		System.out.println(l.compareTo(l1));
		// if 0 it means the strings are equal
		
		String name1 = "Alex";
		String name2 = "Azamat";
		String name3 = "Beckham";
		String name4 = "John";
		// name1 -> name2 -> name3 -> name4
		
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		name3 = name3.toLowerCase();
		name4 = name4.toLowerCase();
		
		boolean b2 = name4.compareTo(name3) > 0;
		boolean b = name3.compareTo(name2) > 0; // if value positive it means name3 is after name2
		boolean b1 = name2.compareTo(name1) > 0; // if value positive it means name2 is after name1
		
		if(b && b1 && b2) {
			System.out.println("Yes, they are in alphabetical order");
		}else {
			System.out.println("No, they are not in order");
		}
	}
}
