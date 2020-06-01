package day32;

public class StringMethodReview {
	public static void main(String[] args) {
		//            01234
		String str = "hello";
		
		System.out.println("Length of the String: " + str.length());
		
		// charAt(index) method?
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// length is 5 
		char ch1 = str.charAt(str.length() - 1);
		System.out.println(ch1); 
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("-------------");
		
		//  01234
		// "hello"
		// indexOf(char) , indexOf(String)
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf("ll"));
		
		String properties = "name = Beknazar, age = 6, course = Java";
		String[] parts = properties.split(",");
		for(String part : parts) {
			int bIndex = part.indexOf("=") + 2;
			System.out.println(part.substring(bIndex).trim());
		}
		
		System.out.println("--------");
		// equals(String)
		String str1 = "apple";
		String str2 = "apple";
		
		if(str1.equals(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("Not equal");
		}
		
		// contains(string)
		String str3 = "hi my name is John";
		System.out.println(str3.contains("nam"));
		
		
		// how to convert numbers(other data type) to String

		int num = 101;
		// To convert primitives to String, we can use valueOf(primitive) 
		String numStr = String.valueOf(num);
		
		// To convert object to String, we can use toString() method
		StringBuilder sb = new StringBuilder();
		String sbStr = sb.toString();
		
		Student st = new Student();
		String sStr = st.toString();
		System.out.println(sStr);
		
		System.out.println("------------");
		// how to convert String to primitives 
		String numStr2 = "96";
		int num2 = Integer.parseInt(numStr2);
		System.out.println("num2: "+ num2);
		
		String dStr = "44.99";
		double dNum = Double.parseDouble(dStr);
		System.out.println(dNum);
		
		
		System.out.println("----------");
		// substring()
		// split()
		// trim()
		// replace()
	    // toCharArray()
	}
}
