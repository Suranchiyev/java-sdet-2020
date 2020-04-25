package day11;

import java.util.Scanner;

public class CharCompare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide word with length 3:");
		String word = scanner.next();
		String originalWord = word;
		
		word = word.toLowerCase();

		// I want to make sure if above variable in alphabetical order

		if (word.length() == 3) {
			
			char l1 = word.charAt(0);
			char l2 = word.charAt(1);
			char l3 = word.charAt(2);

			if (l3 >= l2 && l2 >= l1) {
				System.out.println("Yes, " + originalWord + " is in alphabetical order");
			} else {
				System.out.println("No, " + originalWord + " is not in alphabertical order");
			}
			
		} else {
			System.out.println("Not valid input");
		}

	}
}
