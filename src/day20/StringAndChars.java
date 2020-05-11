package day20;

import java.util.Arrays;

public class StringAndChars {
	public static void main(String[] args) {
		String str = "hello";
		
		// ['h']['e']['l']['l']['o']
		char[] chArr = new char[5];
		chArr[0] = str.charAt(0);
		chArr[1] = str.charAt(1);
		chArr[2] = str.charAt(2);
		chArr[3] = str.charAt(3);
		chArr[4] = str.charAt(4);
		System.out.println(Arrays.toString(chArr));
		System.out.println("--------------");
		
		char[] chArr1 = new char[str.length()];
		for(int i = 0; i < chArr1.length; i++) {
			chArr1[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chArr1));
		System.out.println("--------------");
		
		String strTwo = "John Doe";
		char[] chArr2 = strTwo.toCharArray();		
		System.out.println(Arrays.toString(chArr2));
	}
}
