package day24;

import java.util.Arrays;

public class PassByRef {
	public static void main(String[] args) {
		// All custom objects (Student, Car) are pass by reference
		// StringBuilder is pas by reference
		// Array is pass by reference
		// Wrapper Classes is pass by reference
		
		StringBuilder sb = new StringBuilder("apple");
		changeVal(sb);
		System.out.println(sb);
		
		String[] arrStr = new String[3];
		arrStr[0] = "wood";
		arrStr[1] = "spoon";
		arrStr[2] = "apple";

		System.out.println(Arrays.toString(arrStr));
		
		changeVal(arrStr);
		System.out.println(Arrays.toString(arrStr));
		
	}
	
	public static void changeVal(String[] arr) {
		arr[0] = "John";
		arr[1] = "Smith";
		arr[2] = "Alex";
	}
	
	public static void changeVal(StringBuilder sb) {
		sb.reverse();
	}
}
