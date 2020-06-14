package day39;

public class ExceptionAssigment1 {
	public static void main(String[] args) {
		// Use try catch statement to handle the exc
		try {
			m();
		}catch(IllegalArgumentException e) {
			System.out.println("Exception is handled!");
		}
		
	}
	
	public static void m() {
		throw new IllegalArgumentException();
	}
}
