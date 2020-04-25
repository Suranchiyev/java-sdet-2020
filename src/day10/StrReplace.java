package day10;

public class StrReplace {
	public static void main(String[] args) {
		/**
		 * .replace(oldChar, newChar); It will replace the old char with new char
		 */
		
		String city = "Alma-Ata"; // Alma Ata
		System.out.println(city);
	    city = city.replace("-", " ");
		System.out.println(city);
		
		String str = "Updates=are=available=for=your=software";
		str = str.replace("=", "$");
		System.out.println(str);
		
		String word = "Hello, World!";
		word = word.replace("Hello", "Aloha");
		System.out.println(word);
		
		String str2 = "Apple.Banana.Kiwi.Orange"; // "apple, banana, kiwi, orange"
	
		str2 = str2.toLowerCase();
		str2 = str2.replace(".", ", ");
		
		System.out.println(str2); // apple, banana, kiwi, orange
	}
}
