package day8;

public class MethodOverloading {
	// same method name is the same class
	// different number of arguments
	// different type of arguments
	// different order
	
	public static void main(String[] args) {
		display("apple");
		
		display("apple", "orange");
		
		int num = 5;
		display(num);
		
		display(3.9);
		
		display(5.5, 10);
		display(10, 5.5);
		
		System.out.println("hello");
		System.out.println(5);
		
	}
	
	public static void display(String str) {
		System.out.println(str);
	}
	
	public static void display(String str, String str1) {
		System.out.println(str);
		System.out.println(str1);
	}
	
	public static void display(int number) {
		System.out.println(number);
	}
	
	public static void display(double number) {
		System.out.println(number);
	}
	
	public static int display(int num, double dNum) {
		System.out.println(num);
		System.out.println(dNum);
		return num;
	}
	
	public static int display(double dNum, int num) {
		System.out.println(num);
		System.out.println(dNum);
		return num;
	}

}
