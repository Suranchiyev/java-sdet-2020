package day13;

public class BreakAString {
	public static void main(String[] args) {
		//            012345
		String str = "hello";
		
		int len = str.length(); // 5
		int index = 0;
		while(index < len) {
			//                              5
			System.out.println(str.charAt(index));
			index++;
		}

		/**
		 * b
		 * r
		 * e
		 * a
		 * k
		 * d
		 * o
		 * w
		 * n
		 */
	}
}
