package day15;
import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		// assume seven (7) is lucky number
		// Keep asking from a user a number
		// If provided number is 7 stop asking and print:
		// "Jackpot! It took <steps> steps to get it."
		// otherwise keep asking a number
				
		Scanner input = new Scanner(System.in);
		int userNumber;
		int steps = 0;
		do {
			steps++;
			System.out.println("Provide number:");
			userNumber = input.nextInt();
			
		}while(userNumber != 7);
		
		System.out.println("Jackpot! It took " + steps + " steps to get it.");	
	}
}