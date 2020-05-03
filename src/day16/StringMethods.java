package day16;

public class StringMethods {
	public static void main(String[] args) {
		// How do I find out the length of the String?
		// By using .length() method
		//              01234567     
		String words = "Hey, my name is John Doe";
		System.out.println(words.length());
			
		// How do I get specific char(letter) from the String?
		// By using charAt(index) method 
		
		System.out.println(words.charAt(1)); // e
		
		// String = char
		// String = String
		String ch = String.valueOf(words.charAt(0)); // 'H'
		System.out.println(ch);
		
		String res = lastChar("helo");
		System.out.println(res);
	}	
	
	// write a static method that will return last character from string
	// method will accept one string as an argument
	// return type of the method is String
	// Use it in the main method
    // lastChar("hello"); -> "o"
	
	public static String lastChar(String str) {
		if(str.length() == 0) {
			return str;
		}
		
		char ch = str.charAt(str.length() - 1);
		return String.valueOf(ch);		
	}
}
