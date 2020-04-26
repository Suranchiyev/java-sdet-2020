package day12;

public class TernaryOperator2 {
	public static void main(String[] args) {
		//              F               T
		int number = (5 > 6) ? (4) : (6 > 5 ? 7 : 8) ;
		
		System.out.println(number); // 7
		
		System.out.println( (7 > 6) ? "Hello" : 99.99 );
		
		// it will not compile
		// String str = 7 > 6 ? "Hello" : 99.99;
		
		//               F 
		int number1 = (8 > 9) ? (7 < 100 ? 20 : 30) : (80 > 79 ? 25 : 35);
		System.out.println(number1); // 25
	}
}
