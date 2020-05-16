package day23;

public class LoopsReview1 {
	public static void main(String[] args) {
		
		boolean b = false;
		
		// while loop might have 0 iterations 
		while(b) {
			System.out.println("Hello");
			break;
			
			// ..
			// ..
		}
		
		// do while loop will have at least one iteration 
		do {
			System.out.println("Hello, World!");
			// ..
			// ..
		} while(b);
	}
}
