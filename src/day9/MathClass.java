package day9;

public class MathClass {
	public static void main(String[] args) {
		// The Math.abs() method returns the absolute(positive) value of parameter passed to it
		
		int num = Math.abs(10);
		int num2 = Math.abs(-10);
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(isDiffMore10(40, 20)); // true
		System.out.println(isDiffMore10(10, 30)); // true 
		
		// The Math.ceil() method rounds a decimal point value up to the nearest integer value
		double ceil = Math.ceil(3.01); //4.0
		System.out.println(ceil);
		
		// The Math.floor() rounds down to the nearest intger value
		double floor = Math.floor(8.99); // 8.0
		System.out.println(floor);
		
		// The Math.round() rounds to the nearest integer using normal math round rules
		double dNum = Math.round(23.445); // 23.0
		double dNum1 = Math.round(23.545); //24.0
		System.out.println(dNum);
		System.out.println(dNum1);
		
		System.out.println(Math.min(1, 2));    // 1
		System.out.println(Math.min(2.6, 5.6)); // 2.6
		System.out.println(Math.max(2 ,5));  // 5
		
	}
	
	// if the difference between two numbers is 10 or more than 10 return true
	// otherwise return false
	public static boolean isDiffMore10(int numOne, int numTwo) {
		int diff = Math.abs(numOne - numTwo);
		if(diff >= 10) {
			return true;
		}else {
			return false;
		}
	}
}
