package day10;

public class UpperAndLowerCaseStr {
	public static void main(String[] args) {
		// .toUpperCase() returns string in upper cases
		// .toLowerCase() returns string in lower cases
		// String is immutable. it means you cannot change existing one.
		
		String word = "apple";
		System.out.println(word);
		
		word = word.toUpperCase();
		System.out.println(word);
		
		String str = "orange";
		System.out.println(str.toUpperCase()); // 16 ORANGE
		System.out.println(str);               // 17 orange
		
		word = "BLOG";
		System.out.println(word);
		System.out.println(word.toLowerCase());
		
		//BREAK 10 min. Till 8:14 PM
	}
}
