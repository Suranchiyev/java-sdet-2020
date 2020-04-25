package day7;

public class ConditionalBranching {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
//           5   >  7 => false   
		if (num1 < num2) {
			System.out.println("In Line 7");
		}else {
			System.out.println("In Line 9");
		}


		if(5 > 7) {
			System.out.println("Line 14");
			System.out.println("LIne 15");
		} else {
		    System.out.println("Line 17");
		}
	}
}