package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseChallenges {
	public static void main(String[] args) {
		System.out.println(reverseStr("apple"));
		
		int[] arrNum = {1, 2, 3, 4, 5};
		reverseArr(arrNum);
		System.out.println(Arrays.toString(arrNum));
		
		System.out.println(revWords("apple banana kiwi!"));
		
		System.out.println(revEachWord("apple banana kiwi"));
	}
	
	/*
	 * Time Complexity: O(n)
	 */
	public static String reverseStr(String str) {
		// create variable to store reversed version of input
		String reversedStr = "";
		
		// iterate over input starting from the back
		for(int i = str.length() - 1; i >= 0; i--) {
			
			// add chars to reversed variable
			reversedStr += str.charAt(i);
		}
		
		return reversedStr;
	}
	
	/*
	 * reverseArr({1,2,3,4,5}) -> {5,4,3,2,1}
	 * O(n / 2) -> O(n)
	 */
	public static void reverseArr(int[] arrNum) {
		// pointer that will start from the back of the array
		int j = arrNum.length - 1;
		
		// 'i' is pointer to start from the beginning and loop shold go till half 
		for(int i = 0; i < arrNum.length / 2; i++) {
			// swap elements using pointers if i and (j - i)
			int tmp = arrNum[i];
			arrNum[i] = arrNum[j - i];
			arrNum[j - i] = tmp;
		}
	}
	
	/*
	 * O(n)
	 */
	public static List<String> reverseList(List<String> list) {
		List<String> reversedList = new ArrayList<>();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		
		return reversedList;
	}
	
	
	/*
	 * revWords("apple banana kiwi") -> "kiwi banana apple"
	 * O(n)
	 */
	public static String revWords(String str) {
		boolean isExc = str.endsWith("!");
		
		str = isExc ? str.substring(0, str.length() -1) : str;
		
		String reversedWords = "";
		
		// split string by " " space to get each word in String[] 
		String[] words = str.split(" ");
		
		// loop over the array from back
		for(int i = words.length - 1; i >= 0; i--) {
			reversedWords += words[i] + " ";
		}
		
		reversedWords = reversedWords.trim();
		reversedWords = isExc ? reversedWords + "!" : reversedWords;
		return reversedWords;
	}
	
	
	/*
	 * revEachWord("apple banana kiwi") -> "elppa ananab iwik"
	 * revEachWord("abc def")           -> "cba fed"
	 * Time Complexity: O(n^2)
	 */
	public static String revEachWord(String str) {
		String reversed = "";
		
		// [apple] [banana] [kiwi]
		String[] words = str.split(" ");
		
		for(String word : words) {
			
			String reversedWord = "";
			
			for(int i = word.length() - 1; i >= 0; i--) {
				reversedWord += word.charAt(i);
			}
			
			// "elppa ananab iwik "
			reversed += reversedWord + " ";
			
		}
		
		// trim to remove space in the end
		return reversed.trim();
	}
}
