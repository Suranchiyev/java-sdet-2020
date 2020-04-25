package day10;
import java.util.Scanner;

public class StrCount {
	public static void main(String[] args) {
		/**
		 *  Program should ask a user to type any word
		 *  It will print the number of letters in the given word
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any word: ");
		String word = scanner.next();
		               
		int count = word.length();
		
		System.out.println("Your word has " + count + " letters inside");
	}
}
