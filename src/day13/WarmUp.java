package day13;

public class WarmUp {
	public static void main(String[] args) {
		boolean res = isOddLength("apple"); // true
		System.out.println(res);
	}
	
	// Create a static method isOddLength that will accept one String as an argument
	// If the length of the argument string is odd return true otherwise return false
			
	public static boolean isOddLength(String str) {
		int len = str.length();
		if(len % 2 == 0) {
			return false;
		}else {
			return true;
		}
	}
}
