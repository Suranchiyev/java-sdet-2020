package day14;

public class ForLoop {
	public static void main(String[] args) {
		// for loop - we use for loop when we know the exact iteration in advance
		// while loop - we use when we don't know the exact number of iterations
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Java is cool " + i);
		}
		
		System.out.println();
		
		// Initializing Action, Boolean expression, Update Action
		int num;
		//             3 < 3  
		for(num = 1; num < 3; num++) {
			//                1 2
			System.out.print(num+" ");
		}
		
		System.out.println("\n");
		
		// print every other number from 1 - 1000
		for(int i = 1; i <= 1000; i += 100) {
	
			System.out.print(i + " ");
			
			
		}
		
		
		System.out.println("\n");
		// print numbers from 100 -> 1
	    //               0 
		for(int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}
