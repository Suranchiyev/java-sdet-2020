package day38;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		String numStr = sc.next();
		
		try {
			
			int number = Integer.parseInt(numStr);
			if(number % 2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
			
		} catch(NumberFormatException e) {
			System.out.println("Invalid input.");
		}
		
		System.out.println("Completed.");
		
	}
}
