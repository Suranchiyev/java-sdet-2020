package day44;

public class FibonacciNumbers {
	public static void main(String[] args) {
		printFib(30);
	}
	
	/*
	 * Write a method that will accept int n
	 * Method will print n Fibonacci numbers
	 * Time Complexity: O(n) 
	 */
	public static void printFib(int n) {
		int numOne = 0;
		int numTwo = 1;		
		
		for(int i = 0; i < n; i++) {
			System.out.print(numOne + " "); 			  
			int sum = numOne + numTwo;	
			numOne = numTwo;
			numTwo = sum;		
		}
	}
}
