package day19;

public class WarmUp {
	public static void main(String[] args) {
		String str = new String("apple");           // String Pool:
		                                            // ["apple"] ["john"]
		String str1 = "apple";
		String name = "john";
		String str2 = "apple";

		
		System.out.println(str.equals(str1)); // true
		System.out.println(str == str1);      // false
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2);    // true
		
		// Can you tell what's the output from this program?
		
		// == to compare if they are pointing to the same object
		// String Pool
	}
}
