package day8;
import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double numOne = 0.0;
		double numTwo = 0.0;
		double result = 0.0;
		
		//TODO your code goes here. To get double input from Scanner and then multiply numOne and numTwo
		numOne = scanner.nextDouble();
		
		System.out.println(numOne + " * " + numTwo + " = " + result);
	}
}
