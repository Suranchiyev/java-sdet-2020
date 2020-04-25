package day9;

public class Calculator {
	
	public static int sum(int numOne, int numTwo) {
		return numOne + numTwo;
	}
		
	public static int multiply(int numOne, int numTwo) {
		return numOne * numTwo;
	}
	
	public static int division(int numOne, int numTwo) {
		return numOne / numTwo;
	}
	
	public static double sum(double numOne, double numTwo) {
		return numOne + numTwo;
	}
	
	public static String concat(String str, String str1) {
		return str + str1;
	}
	
	public static String makeStr(String word) {
		return "<>" + word + "</>";
	}
	
	public static String makeStr(String wordOne, String wordTwo) {
		return "<"+wordTwo+">" + wordOne + "</"+wordTwo+">";
	}
}
