package day44;

public class PopularChallenges {
	public static void main(String[] args) {
		fizzBuzz();
		evenOrOdd(3);
	}
	
	/*
	 * Time Complexity: O(1)
	 */
	public static void fizzBuzz() {
		// 1. print numbers from 1 to 100
		// 2. add filters using if else and mod
		
		for(int i = 1; i <= 100; i++) {		
			if(i % 3 == 0 && i % 5 == 0) {				
				System.out.println("FizzBuzz");		
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i + " ");
			}
		}
	}
	
	
	/*
	 * evenOrOdd(3) -> Odd
	 * evenOrOdd(2) -> Even
	 * Time Complexity: O(1) 
	 */
	public static void evenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	
	/*
	 * sumIndex({1, 2, 3, 4, 5}, 4)     -> {1, 3}
	 * sumIndex({7, 7, 4, 3, 8}, 7)     -> {3, 4}
	 * Brute Force
	 * Time Complexity: O(n^2)
	 */
	 public static int[] sumIndex(int[] numArr, int sumNum) {
		 int[] indexes = new int[2];
		 
		 for(int i = 0; i < numArr.length; i++) {
			 for(int j = i + 1; j < numArr.length; j++) {
				 if(numArr[i] + numArr[j] == sumNum && i != j) {
					 indexes[0] = numArr[i];
					 indexes[1] = numArr[j];
					 return indexes;
				 }
			 }
		 }
		 
		 return indexes;
	 }
}
