package day38;

public class ToUpperCase {
	public static void main(String[] args) {
		String str = null;
		str = makeItUpperCase(str);
		System.out.println(str);
	}
	
	public static String makeItUpperCase(String str) {
		// TODO catch exception for the null str - print "Invalid input" and return ""
		try {
			return str.toUpperCase();
		}catch (NullPointerException e) {
			System.out.println("Invalid input");
			return "";
		}
	}
}
