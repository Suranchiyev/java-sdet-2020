package day14;

public class ReverseString {
	public static void main(String[] args) {
		// I want to create a method that takes one String as an argument 
		// Method will return another string which is reverse version of argument
		
		// reverseStr("apple") -> "elppa"
		// reverseStr("hello") -> "olleh"
		
		System.out.println(reverseStr("hello"));
		System.out.println(reverseStr("apple"));
	}
	
	//                                   "hello"
	public static String reverseStr(String str) {
		String reversedStr = "";
		
		// from last char to the first char
		// 01234
		// hello -> 5
		//      4       5 - 1        -1 >= 0 -> false
		for(int i = str.length() - 1; i >= 0; i--) {
			//  "olleh"  =    "olleh"   +     h     0
			reversedStr = reversedStr + str.charAt(i);
		}
		
		return reversedStr;
	}
}
