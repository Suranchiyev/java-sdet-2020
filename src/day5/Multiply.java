package day5;

public class Multiply {
	public static void main(String[] args) {
		int numOne = Integer.parseInt(args[0]);
		int numTwo = Integer.parseInt(args[1]);
		int result = numOne * numTwo;

		System.out.println(numOne + " * " + numTwo + " = " + result);
	}
}
