package day32;

import day33.Person;

public class WarmUp {
	public static void main(String[] args) {
		String str = "hi my name is John";
		// write a method to reverse a sentence

		str = revSentence(str);
		System.out.println(str); // John is name my hi

		//                                 0   1    2    3   4
		// 1. Split the string by " " -> [hi][my][name][is][John]
		// 2. Loop over array from the back to start
		// 3. Put into another variable separated by space
		// 4. return that variable
	}

	public static String revSentence(String str) {
		// "hi my name is John" -> "John is name my hi"
		
		String res = "";
		String[] parts = str.split(" ");

		// ["hi"]["my"]["name"]["is"]["John"]
		//   0      1     2       3    4
		
		//      3                     3 >= 0  i--
		for(int i = parts.length - 1; i >= 0; i--) {
		// "John is name my hi "
			res += parts[i] + " ";
		}
		
		return res;
	}
}
