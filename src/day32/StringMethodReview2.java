package day32;

import java.util.Arrays;

public class StringMethodReview2 {
	public static void main(String[] args) {
		// substring()
		// trim()
		// replace()
		
		// split()
	    // toCharArray()
		
		// -----
		// substring(start)
		// substring(start, end)
		
		//            012345678911234567
		String str = "hi my name is John";
		String str2 = str.substring(6);
		System.out.println(str2); // name is John
		
		str2 = str.substring(6, 10);
		System.out.println(str2); // name
		
		str2 = str.substring(0, 2);
		System.out.println(str2); // hi
		
		
		// trim()
		// "23.6 "
		String sD = "   23.6 ";
		System.out.println(sD.length());
		sD = sD.trim();
		System.out.println(sD.length());
		
		double dNum = Double.parseDouble(sD);
		System.out.println(dNum);
		
		
		System.out.println("-----------");
		// replace(old, new);
		
		String str3 = "!Hello John!";
		System.out.println(str3);
		
		str3 = str3.replace("John", "Bob");
		System.out.println(str3);
		
		str3 = str3.replace("!", "?");
		System.out.println(str3);
		
		
		System.out.println("-----------");
		
		String name = "john smith alex bob lee";
		System.out.println(name);
		// "John Smith Alex Bob Lee"
		
		// ["john"] ["smith"] ["alex"] ["bob"] ["lee"]
		String[] namesArr = name.split(" ");
		
		name = "";
		for(String part : namesArr) {
			 name += part.substring(0, 1).toUpperCase() + part.substring(1) + " ";
			
			//                                 0, 1
			// System.out.println(part.substring(0, 1).toUpperCase() + part.substring(1));
		}
		
		System.out.println(name);
		
		
		System.out.println("-------------");
		// toCharArray() 
		String l1 = "ABC";
		String l2 = "BCA";
	    System.out.println(isSame(l1, l2)); // true

	    System.out.println(isSame("ABC", "CBA")); // true
	    System.out.println(isSame("BCA", "CBA")); // true
	    System.out.println(isSame("ABC", "BEA")); // false
	}
	
	public static boolean isSame(String str, String str1) {
		// "ABC" -> ['A']['B']['C']
		char[] chArr = str.toCharArray();
		char[] chArr1 = str1.toCharArray();
		
		Arrays.sort(chArr);
		Arrays.sort(chArr1);
		
		return Arrays.equals(chArr, chArr1);
	}
}
