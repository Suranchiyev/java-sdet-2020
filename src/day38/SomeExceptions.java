package day38;

public class SomeExceptions {
	public static void main(String[] args) {
		 
		// NullPointerException will come object is null 
		// and we are trying to use some methods or instance variables
		//String str = null; 
		String str = "appel";
		str = str.toLowerCase();
		
		String strNum = "432hj";
		int num = Integer.parseInt(strNum);
		
		String str1 = "apple";
		str1.charAt(7);
	}
}
