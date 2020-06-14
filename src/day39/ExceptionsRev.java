package day39;

public class ExceptionsRev {
	public static void main(String[] args) {
		// 1. Exceptions
		//    - Runtime Time (RuntimeException). We don't have to handle runtime exceptions
		//    - Checked Exceptions. We must handle checked exceptions
				
		// 2. Errors 
		
		String str = null;
		try {
			
			str.substring(0, 5);
			
		}catch(NullPointerException e) {
			System.out.println("It was null pointer exception: " + e.getMessage());
		}catch(Exception e1) {
			
			System.out.println("It was exception: " + e1.getMessage());
		}finally {
			// it will execute always. Most of the time we use to close the resources (file, db)
			
			// What's the final, finally, finalize?
			
			// final variable - cannot change the value
			// final method   - cannot override it
			// final class    - cannot extend it
		}
		
		System.out.println("hello");
		System.out.println("--------");
		
		// print();
		try {
			sum(1, -6);
		}catch(Exception e) {
			System.out.println("Catch exception");
		}
		
		
		//sum(1, 2, -3);
		
		//doSomthing();
	}
	
	public static void print() throws InterruptedException {
		System.out.println("Hello");
		
		Thread.sleep(1000);
		
		System.out.println("World");
	}
	
	public static int sum(int i, int i1) throws Exception {	
		// we must handle checked exceptions 
		if(i < 0 || i1 < 0) {
			throw new Exception("No negative numbers");
		}
		return i + i1;
	}
	
	public static int sum(int i, int i1, int i2) {
		// we don't have to handle runtime exceptions
		if(i < 0 || i1 < 0 || i2 < 0) {
			throw new IllegalArgumentException("Invalid input. Numbers cannot be negative");
		}
		
		return i + i1 + i2;
	}
	
	
	public static void doSomthing() {
		System.out.println("Hello, World!");
		doSomthing();
	}
}
