package day8;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOne;
		int numTwo;
		int result;
		
		System.out.println("Provide first whole number:");
		numOne = scanner.nextInt();
		
		System.out.println("Provide second whole number:");
		numTwo = scanner.nextInt();
		
		result = numOne + numTwo;
		System.out.println(numOne + " + " + numTwo + " = " + result);
		
	}
}
