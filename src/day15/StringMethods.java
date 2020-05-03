package day15;

public class StringMethods {
	public static void main(String[] args) {
		// System.out.println( reverseStr("hello") ); // olleh
		// System.out.println( reverseStr("12345") ); // 54321
		// System.out.println( reverseStr("abcd") ); // dcba

		// System.out.println(getCharNum("apple", 'x')); // 2

		// System.out.println(getNumberOfVowelLetters("hello")); // 2
		// String res = getVowelLetters("hello"); // eo
		// System.out.println(res);

		//System.out.println(countDog("dogcatdogdogdogdog"));
		
		System.out.println(isInAlphabeticalOrder("Abcd")); // true
		System.out.println(isInAlphabeticalOrder("bcda")); // false
		System.out.println(isInAlphabeticalOrder("ax"));   // true
	}

	public static String reverseStr(String str) {
		String strRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}

		return strRev;
	}

	public static int getCharNum(String str, char letter) {
		int numberOfChar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == letter) {
				numberOfChar++;
			}
		}

		return numberOfChar;
	}

	// Vowel letters: A, E, I, O, U (a, e, i, o, u)
	public static int getNumberOfVowelLetters(String str) {
		// 01234
		// getNumberOfVowelLetters("hello"); -> 2
		// getNumberOfVowelLetters("collector"); -> 3

		int count = 0;
		String vowelL = "AEIOUaeiou";

		for (int i = 0; i < str.length(); i++) {
			// using charAt method toget char by index
			char l = str.charAt(i);
			// convert char to String
			String letter = String.valueOf(l);

			// check if letter is vowel letter
			if (vowelL.contains(letter)) {
				count++;
			}
		}

		return count;
	}

	public static String getVowelLetters(String str) {
		// TODO
		// getVowelLetters("hello"); // eo
		// getVowelLetters("reference"); // eeee

		String vLetters = "";
		String vowelL = "AEIOUaeiou";

		for (int i = 0; i < str.length(); i++) {
			// 'o' 4
			char ch = str.charAt(i);
			// "o"
			String letter = String.valueOf(ch);

			// "AEIOUaeiou" -> "o"
			if (vowelL.contains(letter)) {
				// hello
				// vLetters = vLetters + letter;
				// "eo" = "e" + "o"
				vLetters += letter;
			}

		}
		return vLetters;
	}

	public static int countDog(String str) {
		// countDog("dog is big dog") // 2
		// countDog("dogdogdogcatdogcat") // 4
		// countDog("dogcatdog") // 2
		String searchWord = "dog";
		int numberOfWords = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			String subStr = str.substring(i, i + searchWord.length());
			if (subStr.equals(searchWord)) {
				numberOfWords++;
			}
		}
		return numberOfWords;
	}

	public static boolean isInAlphabeticalOrder(String str) {
		// isInAlphabeticalOrder("Abcd"); -> true
		// isInAlphabeticalOrder("bcda"); -> false
		// isInAlphabeticalOrder("ax"); -> true

		for (int i = 0; i < str.length() - 1; i++) {
			char fChar = str.charAt(i);
			char sChar = str.charAt(i + 1);
			
			// if letters in not in alphabetical order return false
			if(fChar > sChar) {
				return false;
			}
		}
		
		return true;
	}

}
