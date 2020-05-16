package day23;

import java.util.Arrays;

public class StringReview {
	public static void main(String[] args) {
		//            01234
		String str = "apple"; // will use string pool
		String str1 = new String("apple"); // will not use string pool
		
		System.out.println("Size: " + str.length());
		
		System.out.println(str.charAt(0)); // a
		
		char l = str.charAt(4);
		System.out.println(l);
		
		System.out.println(str.indexOf('l')); // 3
		int index = str.indexOf("pp");
		System.out.println(index);
		
		//  01234
		// "apple"
		System.out.println(str.substring(1)); // pple
		System.out.println(str); // apple
		// str = str.substring(1);
		System.out.println(str.substring(1, 4)); // ppl 
		
		
		String str2 = "apple"; // reuse existing object in string pool which was created in line 6
		System.out.println("-------");
		System.out.println(str);
		System.out.println(str1);
		System.out.println("Line 32: " + (str == str1));
		System.out.println("Line 33: " + str.equals(str1));
		System.out.println("Line 34: " + (str == str2));
		
		System.out.println("-------");
		
		str = "hello, world!,hello";
		System.out.println(str.contains("world!"));
		
		//toCharArray()
		char[] strArr = str.toCharArray(); //
		System.out.println(Arrays.toString(strArr));
		
		//split(string)
		String[] parts = str.split(","); // "hello, world!,hello" -> ["hello"][" world!"]["hello"]
		for(String word : parts) {
			System.out.println(word);
		}
		
		System.out.println("--------");
		str = "john";
		System.out.println(str.replace("n", "N"));
		System.out.println(str.replace("jo", "Ro"));
		System.out.println(str);
		
		str = "  apple  ";
		System.out.println(str);
		System.out.println(str.trim());
		
		int num = 99; // "99"
		String strNum = String.valueOf(num);
		System.out.println(strNum);
	}
}
