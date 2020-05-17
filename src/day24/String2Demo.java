package day24;

public class String2Demo {
	public static void main(String[] args) {
		ConsoleInput input = new ConsoleInput();
		System.out.println("Enter Name:");
		String name = input.getStr();
		System.out.println(name);
		
		String2 str =  new String2("apple");
		System.out.println(str);
		
		System.out.println(str.length());
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		str = str.reverse();
		System.out.println(str);
	}
}
