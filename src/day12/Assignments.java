package day12;

public class Assignments {
	enum DayOfWeek {Mon, Tue, Wed, Thur, Fri, Sat, Sun};
	
	public static void main(String[] args) {
//		System.out.println(flipStr("orange")); // ngeora
//		System.out.println(flipStr("ABCD")); // CDAB
//		System.out.println(flipStr("ab")); // CDAB
		
//		System.out.println(isFirstEqualsToLast("ahljklbna")); // true
//		System.out.println(isFirstEqualsToLast("abcd")); // false
//		System.out.println(isFirstEqualsToLast("cc")); // true
		
		myWeek(DayOfWeek.Fri); // Coding day!
	}
	
	/**
	 *  Assume that parameter str will be only even length and length will be more than 2
	 *  Method should split argument string in the middle and swap them
	 *  
	 *  flipStr("orange") -> ngeora
	 *  flipStr("ABCD")   -> CDAB
	 *  flipStr("ab")     -> ba
	 */
	public static String flipStr(String str) {
		String firstPart = str.substring(0, str.length() / 2);
		String secondPart = str.substring(str.length() / 2);
		return secondPart + firstPart;
	}
	
	
	/**
	 * - If first and last letter of argument str is equal return true
	 *   otherwise return false
	 * - length will be more than 2
	 */
	public static boolean isFirstEqualsToLast(String str) {
		String fL = str.substring(0, 1); 
		String sL = str.substring(str.length() - 1);
		return fL.equals(sL);
	}
	
	/**
	 * Based on day print this messages:
	 * Mon - Home work day!
	 * Tue - Study day!
	 * Wed - Chill day!
	 * Thur - Study day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Java epic day!
	 */
	public static void myWeek(DayOfWeek day) {
		// TODO your code goes here
		// Use switch
	}
}
