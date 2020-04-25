package day5;

public class InputFromTerminal {
	public static void main(String[] args) {
		// java InputFromTerminal 34 90
		// 34 + 90 = 124

		int numberOne = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);
		int sum = numberOne + numberTwo;

		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
		// BREAK 10 min 9:10 PM EST
	}
}