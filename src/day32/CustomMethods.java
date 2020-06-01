package day32;

public class CustomMethods {
	String wordToPrint;
	// void
	// return methods
	// arguments 
	
	public void print10() {
		for(int i = 0; i < 10; i++) {
			System.out.println(wordToPrint);
		}
	}
	
	public void print10(String str) {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
		}
	}
	
	public String copy3(String str) {
		//System.out.println("Hello");
		return str + str + str;
	}
	
	public int getMax(int[] nums) {
		return 0;
	}
	
	public static void sayHelloToWorld() {
		System.out.println("Hello, World!");
	}
}
