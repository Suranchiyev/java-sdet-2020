package day11;

public class StrMethodsReview {
	public static void main(String[] args) {
		String str = "Java";
		String str1 = "java";
		System.out.println(str.equals(str1)); // false
		System.out.println(str.equalsIgnoreCase(str1)); // true
		
		String word = null;
		//int len = word.length();
		//System.out.println(len);
		
		word = "";
		
		System.out.println(word.length());
		if(word.length() < 1) {
			System.out.println("It's empty");
		}else {
			System.out.println("No, its not empty");
		}
		
		if(word.isEmpty()) {
			System.out.println("It's empty");
		}else {
			System.out.println("No, its not empty");
		}
	}
}
