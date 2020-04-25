package day7;

public class LuckyNumbers {
	public static void main(String[] args) {

		// Get number from a terminal
		// Assume that numbers: 7, 13, 99 are lucky numbers
		// if users number is lucky number, print "Jackpot!"
		// otherwise print "Sorry, Not today. Come tomorrow!";

		boolean isLucky = isLuckyNumber(Integer.parseInt(args[0]));
		if(isLucky) {
			System.out.println("Jackpot!");
		}else {
			System.out.println("Sorry, Not today. Come tomorrow!");
		}

	}

	public static boolean isLuckyNumber(int number) {
		// && if one the conditions is false whole expression will be false
		// || if one the condition is true whole exresion will be true

		if(number == 7 || number == 13 || number == 99) {
			return true;
		} else {
			return false;
		}		
	}
}