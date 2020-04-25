package day4;

public class InputFromTerminal1 {
	public static void main(String[] args) {
		String name = args[0];
	    //int age = args[1];
		int age = Integer.parseInt(args[1]);

		// make him older by 1 year
		age = age + 1;

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}