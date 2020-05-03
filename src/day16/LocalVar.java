package day16;

public class LocalVar {
	public static String name;
	public static int age;
	public static boolean isHuman;
	
	public static void main(String[] args) {
		// local variables don't have default values
		String str = "";
		System.out.println(str);
		
		// default value for object is null
		System.out.println(name);
		
		// default value for primitive numbers is 0
		System.out.println(age);
		
		// default value of boolean is false
		System.out.println(isHuman);	
	}
}	
