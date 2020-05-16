package day23;

public class ConditionalBranching {
	public static void main(String[] args) {
		boolean b = 5 > 4;
		if (b) {
			System.out.println("True!");
		} else { 
			System.out.println("False");
		}
			
		System.out.println("Hello");
		
		int num = 3;
		
		if(num == 1) {
			System.out.println("One");
		}else if(num == 2) {
			System.out.println("Two");
		}else if(num == 3) {
			System.out.println("Three");
		}else {
			System.out.println("Other number");
		}
		
		System.out.println("----------");
		//                 
		//              f  ||   f 
		boolean b1 = 7 > 9 || 7 < 6 || 1 == 1;
		System.out.println(b1); // true
		                                                       
		boolean b2 = 5 > 3 || 7 < 9 && 7 > 6 && true && 2 == 2 && 5 < 4 ;
		System.out.println(b2); // true
		
		boolean b3 = false;
		b3 = !b3;
		System.out.println(b3); // true
		
		int i = 9;
		int i1 = 10;
		// not equal
		if(i != i1) {
			System.out.println("Here !=");
		}
		
		if(i == i1) {
			System.out.println("Here ==");
		}
	}
}
