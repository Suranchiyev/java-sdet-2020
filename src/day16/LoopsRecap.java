package day16;

public class LoopsRecap {
	public static void main(String[] args) {
		
		//               f
		//             5 < 5;
		for(int i = 0; i < 5; i++) {		
			System.out.println("Hello");
		}
		
		// can you write a loop that will print numbers from 1 to 10		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// can you write a loop that will print numbers from 5 - 1
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		//            0123456
		String str = "project";		
		for(int i = 0; i < 7; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\n");
		
		//  0123456
		// "project"
		// Write a code that will print reverse version of str each letter in the new line
		
		String strOne = "";
		for(int i = 6; i >= 0; i--) {
			//System.out.println(str.charAt(i));
			strOne += str.charAt(i);
		}
		System.out.println(strOne); // tcejorp
	}
	
	// create a static method that accepts one string as argument
	// method will return reverse version of its argument
	// myMehtod("hello"); // "olleh"
	
	public static String revStr(String str) {
		//  01234
		// "hello" -> .length() -> 5
		// length() - 1 -> 4
		// index starts with 0
		// .length() will return exact number of characters in the string
		
		String strOne = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			strOne += str.charAt(i);
		}
		
		return strOne;
	}
	
}
