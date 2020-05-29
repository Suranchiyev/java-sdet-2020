package day30;

public class WarmUp {
	public static void main(String[] args) {
		String str = "John";
		str = reverseStr(str);
		
		System.out.println(str); // olleh
	}
	
	public static String reverseStr(String str) {
		String rev = "";
		
		// hello
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		return rev;
	}
}
