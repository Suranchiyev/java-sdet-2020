package day13;

public class InfiniteLoop {
	public static void main(String[] args) {
		boolean b = true;
		
		//   true
		while(b) {
			//System.out.println("Hello, World!");
			b = true;
			b = false;
		}
		
		
		int number = 2;
		int number1 = 0;
		
		//     2     >   0 -> t
		while(number > number1) {
			System.out.println("Hello, World");
			number1++;
		}
		
		System.out.println("The End");
	}
}
