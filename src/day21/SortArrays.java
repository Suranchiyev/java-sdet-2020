package day21;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 100, 0, 1, 5, 88, 90};
		System.out.println(Arrays.toString(num));
		
		// sort using Arrays helper class
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		String[] names = {"Boris", "Akylbek", "Frank", "Selvin", "Edil", "Alex"};
		System.out.println(Arrays.toString(names));
		
		// sort Strings using Arrays helper class
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		String str = "becad"; // abcde
		System.out.println(str);
		// convert string to char[] array. Each letter as char[] element
		char[] letters = str.toCharArray();
		
		// sort char[] using Arrays class
		Arrays.sort(letters);
		
		// put back to String str
		str = "";
		for(char letter : letters) {
			str += letter;
		}
		
		System.out.println(str); // abcde
	}
}
