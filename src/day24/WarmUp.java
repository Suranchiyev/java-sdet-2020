package day24;

public class WarmUp {
	public static void main(String[] args) {
		boolean isP = isPalindrom("Anna");
		System.out.println(isP); // true
		
		boolean isP1 = isPalindrom("Civic");
		System.out.println(isP1); // true
		
		boolean isP2 = isPalindrom("Apple");
		System.out.println(isP2); // false
		
		System.out.println("-------------");
		
		System.out.println(isPalindrom2("Anna"));
		System.out.println(isPalindrom2("Racecar"));
		System.out.println(isPalindrom2("Repaper"));
		System.out.println(isPalindrom2("John"));
		System.out.println(isPalindrom2("abcdefdfgdfg"));
		
	}
	
	/*
	 * Anna
	 * Civic
	 * Kayak 
	 * 
	 */
	public static boolean isPalindrom(String str) {
		// Ignore case
		str = str.toLowerCase();
		
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return str.equals(rev);
	}
	
	public static boolean isPalindrom2(String str) {
		str = str.toLowerCase();
		 
		// 0123456
		// repaper
		//   7
		int len = str.length();
		//      0      3 < 3          
		for(int i = 0; i < len / 2; i++) {
			 //          
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		
		return true;
	}
}
