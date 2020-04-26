package day12;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(removeSpaces(" ap ple"));   // "apple"
		System.out.println(removeSpaces(" orange "));   // "orange"
		System.out.println(removeSpaces("b anana  ")); // "banana"
		System.out.println(removeSpaces("ki wi"));     //"kiwi"
	}
	
	public static String removeSpaces(String str) {
		// return str.replace(" ", "");
		
		str = str.trim();
		
		if(str.contains(" ")) {
			String firstPart = str.substring(0, str.indexOf(" "));
			String secondPart = str.substring(str.indexOf(" ") + 1);
			return firstPart + secondPart;
		}
		
		return str;
	}
}
