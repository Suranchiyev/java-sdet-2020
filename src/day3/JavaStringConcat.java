package day3;

public class JavaStringConcat {
	public static void main(String args[]) {
		String str = "Hello";
		String str1 = "World";
		String str2 = str + str1;

		System.out.println(str2); // HelloWorld

		str2 = str1;
		System.out.println(str2); // World

//            "World" + "Hello
		str1 = str2 + str;
		System.out.println(str1); // WorldHello
	}
}