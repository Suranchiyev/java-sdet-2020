package day28;

public class SbReview {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Good");
		sb.append("Morning");
		
		// Some of the String methods we can use in StringBuilder
		System.out.println(sb);
		System.out.println(sb.getClass());
		
		// Convert StringBuilder to String
		String str = sb.toString();
		System.out.println(str);
		System.out.println(str.getClass());
		
		// Convert String to StringBuilder
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1);
		
		sb1.reverse();
		sb1.delete(0, 2);
	}
}
