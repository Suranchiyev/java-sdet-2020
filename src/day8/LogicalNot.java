package day8;

public class LogicalNot {
	public static void main(String[] args) {
		// ! - logical not
		// ! - reverts the value of boolean expression
		
		boolean b = true;
		
		if(!b) {
			System.out.println("Yes, true");
		}else {
			System.out.println("No, false");
		}
		
		boolean b1 = !false;
		System.out.println(b1);
		
		boolean b2 = !true;
		System.out.println(b2);
		
		// if the number is not 5 then print: "Is not five"
		//        false
		boolean isEqualToFive = isEqual(5);
		//    !false
		if(!isEqualToFive) {
			System.out.print("Is not five");
		}
		
		int number = 9;
		
		// 9 not equal 7 -> true
		if(number != 7) {
			System.out.println("Please provide proper number");
		}else {
			System.out.println("You good");
		}
	}
	
	public static boolean isEqual(int num) {
		if (num == 5) {
			return true;
		}else {
			return false;
		}
	}
}
