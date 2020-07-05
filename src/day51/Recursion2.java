package day51;

public class Recursion2 {
	public static void main(String[] args) {
		System.out.println(fact(15));
	}
	
	public static int fact(int num) {
		// Base case
		if(num == 1) {
			return 1;
			
		}else {
			
			// recursion case 
			return num * fact(num - 1);
		}
	}
}
