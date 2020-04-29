package day13;

public class Hundred {
	public static void main(String[] args) {
		// Write a program that will print numbers from 1 to 10 in the same line with space separator
		// ex: 1 2 3 4 5 6 7 8 9 10 
		// Use while loop
		
		int index = 1;
		while(index <= 10) {
			System.out.print(index+" ");
			index++;
		}
		
		System.out.println();
		
		int indexTwo = 10;
		while(indexTwo >= 1) {
			System.out.print(indexTwo+" ");
			indexTwo--;
		}
		
		// Write a program that will print number from 10 to 1 in the same line with space separator
		// ex: 10 9 8 7 6 5 4 3 2 1 
		// Use while loop
	}
}
