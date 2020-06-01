package day32;

public class StringReview {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = new String("apple");
		String str2 = "apple";
		
		String str3 = "banana";
		
		String str4 = "applle";
		
		str2 = "applee";
		
		// == to compare references if they are pointing to the same object
		
		
		System.out.println(str == str1);      // false
		System.out.println(str == str2);      // true
		
		// equals method always checks the content
		System.out.println(str.equals(str1)); // true
	}
}
