package day20;

import java.util.Arrays;


public class StrSplit {
	public static void main(String[] args) {
		
		String str = "Java 101 for SDET 2020 TLA";
		
		// [Java] [101] [for] [SDET] [2020] [TLA]
		String[] words = str.split(" ");
		
		System.out.println(words.length);
		
		for(String word : words) {
			System.out.println(word);
		}
		
		System.out.println("----------------");
		
		String str1 = "abc&cd&ui&s&r";
		// abc | cd | ui | s | r
		String[] strArr = str1.split("&");
		
		System.out.println(strArr.length); // 5
		
		for(String el : strArr) {
			System.out.println(el);
		}
		
		System.out.println("----------------");
		
		String str2 = "HelloJohnHello";
		String[] strArr2 = str2.split("John");
		
		// ["Hello", "Hello"]
		System.out.println(strArr2.length); // 2
		
		System.out.println(Arrays.toString(strArr2));
		
		for(String el : strArr2) {
			System.out.println(el); // Hello
			                        // Hello
		}
	}
}
