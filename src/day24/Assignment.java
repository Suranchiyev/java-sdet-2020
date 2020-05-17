package day24;

public class Assignment {
	public static void main(String[] args) {
		/*
		 * Create a method that will accept diffrent number of String arguments
		 * and return them as one String (joining) 
		 */
		
		String str = join("hello", "abc"); 
		System.out.println(str); // helloabc
		
		String str1 = join("a", "b", "c", "d"); 
		System.out.println(str1); // abcd
		
		String[] arrStr = {"John", "Smith", "Alex"};
		String str2 = join(arrStr); 
		System.out.println(str2); // JohnSmithAlex
	}
	
	public static String join(String... strs) {
		String res = "";
		
		for(String str : strs) {
			res += str;
		}
		
		return res;
	}
	
}
