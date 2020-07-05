package day51;

public class Recursion {
	public static void main(String[] args) {
		//printReg(5);
		
		printRec(3);
	}
	
	public static void printReg(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Hello");
		}
	}
	
	public static void printRec(int num) {
		// Base case to exit the recursion
		if(num <= 0) {
			return;
		}
		
		System.out.println("Hello");
		
		// Recursion case - when we call a method itself with different arg value 
		printRec(num - 1);
	}
}
