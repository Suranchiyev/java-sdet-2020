package day43;

import java.util.HashMap;
import java.util.Map;

public class PalindromeChallenges {
	public static void main(String[] args) {
		System.out.println(isPalindrome("anna")); // true
		System.out.println(isPalindrome("apple")); // false
		
		System.out.println("--------");
		
		System.out.println(isPalNum2(12345));
		
		System.out.println(getBiggestPalindromeWord("mom and dad in a racecar hellofromJohn"));
	}
	
	
	/*
	 * isPalindrome("anna") -> true
	 * isPalindrome("apple") -> false
	 * Time Complexity: O(n)
	 */
	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		
		return reversed.equals(str);
	}
	
	
	/*
	 * isPalindrome2("anna") -> true
	 * isPalindrome2("apple") -> false
	 * O(n/2) -> O(n)
	 */
	public static boolean isPalindrome2(String str) {
		// using two pointer start pointer and back pointer 
		// loop till the half
		int j = str.length() - 1;
		                     
		for(int i = 0; i < str.length() / 2; i++) {			
			if(str.charAt(i) != str.charAt(j - i)) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * isPalNum(545)  -> true
	 * isPalNum(1001) -> true
	 * isPalNum(13)   -> false
	 * Time Comp: O(n/2) -> O(n)
	 */
	public static boolean isPalNum(int num) {
		String str = String.valueOf(num);
		
		int j = str.length() - 1;
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(j - i)) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * isPalNum(545)  -> true
	 * isPalNum(1001) -> true
	 * isPalNum(13)   -> false
	 * O(n) - linear
	 */
	public static boolean isPalNum2(int num) {
		// if you want to get the most right number you can % by 10
		//System.out.println(num % 10);
		
		// if you want to remove the most right number you can / by 10
		//System.out.println(num / 10);
		
		int copyOfOriginal = num;
		int digit;
		int reversedNum = 0;
		
		while(num > 0) {			
			digit = num % 10; // get most right digit      
			reversedNum = (reversedNum * 10) + digit; // multiply by 10 to concat, not add (+)
			num = num / 10; // remove most right digit
		}
			
		return reversedNum == copyOfOriginal;
	}
	
	
	
	/*
	 * Find the biggest palindrome word from a String and return it
	 * O(n^2)
	 */
	public static String getBiggestPalindromeWord(String sentence) {
		// 1. get each word as array
		// 2. then get words that are palindromes
		// 3. get biggest palindorme among those 
		
		// get each word as array
		String[] words = sentence.split(" ");
		
		String biggestPal = "";
		
		// loop over the array to check our assumption 
		// "mom and dad in a racecar hellofromJohn"
		for(String word : words) {
			if(isPalindrome2(word) && word.length() > biggestPal.length()) {
				// racecar
				biggestPal = word;
			}
		}
		
		return biggestPal;
	}	
}
