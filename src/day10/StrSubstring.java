package day10;

public class StrSubstring {
	public static void main(String[] args) {
		// Using substring method we can get some part of the string based on indexes
		
		//             01234567891011
		String java = "Java is fun.";
		String javaFun = java.substring(8);
		System.out.println(java);
		System.out.println(javaFun);
		
		//            0123456789
		String str = "SoftSkills";
		str = str.substring(4);
		System.out.println(str);
		
		//     012345678
		str = "workspace";
		str = str.substring(4);
		System.out.println(str);
		
		//             0123456789
	    String str1 = "SoftSkills"; // Soft
	    str1 = str1.substring(0, 4);
	    System.out.println(str1);
	                              
	    //             012345678910111213
	    String str2 = "Java is Cool!"; // is
	    str2 = str2.substring(5, 7);
		System.out.println(str2);
		
		//             012345678
		String str3 = "workspace"; // work
		str3 = str3.substring(0, 4); 
		System.out.println(str3);
		
		         //    0123456789
		String str4 = "HelloWorld"; // loW
		String str5 = "SDLC"; // DL
		String str6 = "Sublime"; // bl
		String str7 = "Window"; // ind
		String str8 = "OptimizePDF"; // PDF
		String str9 = "Navigate"; // Nav
		String str10 = "Search"; // ear
		
		System.out.println("----------------");
		System.out.println(str4.substring(3, 6));		
		System.out.println(str5.substring(1, 3));
		System.out.println(str6.substring(2, 4));
		System.out.println(str7.substring(1, 4));
		System.out.println(str8.substring(8));
		System.out.println(str9.substring(0, 3));
		System.out.println(str10.substring(1, 4));
		
		System.out.println(str5);
	}
}
