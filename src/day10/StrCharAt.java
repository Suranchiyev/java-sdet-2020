package day10;

public class StrCharAt {
	public static void main(String[] args) {
		/**
		 * .charAt(index); -> get specific char by index
		 */
		
		//            0123
		String str = "home";
		char ch = str.charAt(1);
		System.out.println(ch); // o
		
		//     012345
		str = "Public";
		char ch2 = str.charAt(5);
		System.out.println(ch2);
		
		//     0123456
		str = "Pricing";
		System.out.println(str.charAt(6)); // g		
	}
}
