package day44;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("abc", "ccb"));
		
		System.out.println(isAnagram2("listen", "silent"));
		System.out.println(isAnagram2("abc", "ccb"));
		System.out.println(isAnagram2("abc", "bcaa"));
		System.out.println(isAnagram2("aaaacc", "aacccc"));
		System.out.println(isAnagram2("triangle", "integral"));
	}
	
	/*
	 * isAnagram("listen","silent") -> true
	 * isAnagram("abc", "bca")      -> true
	 * isAnagram("abc", "ccb")      -> false
	 * O(n^2) -> sorting is O(n^2)
	 */
	public static boolean isAnagram(String str, String str1) {
		// 1. sort both strings
		//    - convert both strings to char[]
		//    - sort them 
		// 2. compare them, if equal then its anagram
		
		char[] arrStr = str.toCharArray();
		char[] arrStr1 = str1.toCharArray();
		
		Arrays.sort(arrStr);
		Arrays.sort(arrStr1);
		
		return Arrays.equals(arrStr, arrStr1);
	}
	
	/*
	 * O(n^2) or O(n) ?
	 */
	public static boolean isAnagram2(String str, String str1) {
		if(str.length() != str1.length()) {
			return false;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			String letter = String.valueOf(str.charAt(i));
			
			if(!str1.contains(letter)) {
				return false;
			}
			
			letter = String.valueOf(str1.charAt(i));
			if(!str.contains(letter)) {
				return false;
			}
		}
					
		return true;
	}
}
