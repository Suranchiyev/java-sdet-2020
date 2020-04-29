package day13;

public class WhileLoop {
	public static void main(String[] args) {
		int count = 1;
		
		//    10 >= 11 -> false
		while(10 >= count) {
			//                  10
			System.out.println(count);
			count++; // count = count + 1;
				
		}
		
		System.out.println("Here: "+count); // 11
		
		// while(boolean_expression) {
		//   body of the loop
		// }
	}
}
