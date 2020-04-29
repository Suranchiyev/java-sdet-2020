package day13;

public class ReverseString {
	public static void main(String[] args) {
		//            012345
		String str = "abcdef";
		String strReversed = "";	
			
		//    5   =     6 - 1
		int index = str.length() - 1;
		
		//      -1  >= 0
		while(index >= 0) {
			//  "fedcba"      =     "fedcd"    +                     'a' 
			strReversed = strReversed + String.valueOf(str.charAt(index));
			
			 
			
			// -1
			index--; 
		}
		
		System.out.println(strReversed); // 
		System.out.println(index); // -1
		
	}
}
