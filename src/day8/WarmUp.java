package day8;

public class WarmUp {
	public static void main(String[] args) {		
		String evenOddStr = getEvenOdd(12);
		System.out.println(evenOddStr);
		
		evenOddStr = getEvenOdd(10);
		System.out.println(evenOddStr);
		
		evenOddStr = getEvenOdd(3);
		System.out.println(evenOddStr);
	}
	
	public static String getEvenOdd(int number) {
		// except if number is 10 then return "ten"
		 if(number == 10) {
			 return "ten";
		 }
		 
		 if(number % 2 == 0) {
			 return "even";
		 }else {
			 return "odd";
		 }
	}
}
