package day16;

public class MyMethods {
	public static void main(String[] args) {
		boolean b = isStartAbc("abvcasabc");
		System.out.println(b);	
		System.out.println(isStartAbc("abcqwert"));
		
		strSize("john doe");
		
	}
	
	// create a method that accepts one string argument
	// if string argument starts with "abc" return true
	// otherwise return false 
	
	public static boolean isStartAbc(String word) {
		if(word.startsWith("abc")) {
			return true;
		}
		return false;
	}
	
	
	// create a method tha accept one string argument
	// return string which contains first and last letter of the string argument
	// fs("object"); -> "ot"
	public static String fsStr(String str) {
		char fLetter = str.charAt(0);
		char LLetter = str.charAt(str.length() - 1);
		return String.valueOf(fLetter) + String.valueOf(LLetter);
	}
	
	
	// create a method that accepts one String argument
	// if length of the argument is bigger than 5 print "Big string"
	// otherwise print "small string"
	public static void strSize(String str) {
		if(str.length() > 5) {
			System.out.println("Big string");
		} else {
			System.out.println("Small string");
		}
	}
	
	public static int getMaxNumber(int a, int b) {
		return a > b ? a : b;
	}
}
