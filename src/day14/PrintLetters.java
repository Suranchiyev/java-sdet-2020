package day14;

public class PrintLetters {
	public static void main(String[] args) {
		//            01234
		String str = "Hello World!";
		//System.out.println(str.charAt(0)); // H
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '!') {
				continue;
			}
			System.out.println(str.charAt(i));
		}
		
		/**
		 * h
		 * e
		 * l
		 * l
		 * o
		 */
	}
}
