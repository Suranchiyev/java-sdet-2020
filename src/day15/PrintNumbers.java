package day15;

public class PrintNumbers {
	public static void main(String[] args) {
		// printEvenNumbers(10);		
		 printEvenNumbers(1000);
	}
	
	public static void printEvenNumbers(int number) {
		// number - 10
		// only even number from 1 to 10 inclusive
		// 2, 4, 6, 8, 10
		
		// number - 100
		// 2, 4, 6, 8, 10, 12, 14 .....
		
		// for loop (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		// i % 2 == 0 -> true; to figure out if number is even
		
		for(int i = 1; i <= number; i++) {		
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
	}
}
