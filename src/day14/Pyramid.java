package day14;
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		String pyramid = "#";
		for(int i = 0; i < number; i++) {
			//                    ##
			System.out.println(pyramid);
			//  ####     ###  +  #
			pyramid = pyramid + "#";
		}
		
		// String str = "############################";
		// ##########
		// #########
		// #######
		// #####
		
		/**
		 * Ask from user number as input
		 * print pyramid based on this number
		 * 
		 * 5
		 * #
		 * ##
		 * ###
		 * ####
		 * #####
		 * 
		 * 3
		 * #
		 * ##
		 * ###
		 */
		
		
	}
}
