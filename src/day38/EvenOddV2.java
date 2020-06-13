package day38;

import java.util.Scanner;

public class EvenOddV2 {
	public static void main(String[] args) {
		// TODO ask from user number input using Scanner
		// if user provides non numeric value keep asking
		// otherwise print "Number is ever" or "Number is odd"

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");

		do {
			try {
				// 4
				String input = sc.next();
				int number = Integer.parseInt(input);
				if (number % 2 == 0) {
					System.out.println("Number is even");
				} else {
					System.out.println("Number is odd");
				}

				// number was valid
				break;

			} catch (NumberFormatException e) {
				System.out.println("Enter number: ");
			}

		} while (true);
	}

	public static boolean isOnlyNumbers(String strNum) {
		try {
			Integer.parseInt(strNum);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
