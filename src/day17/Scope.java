package day17;

public class Scope {
	public static void main(String[] args) {
		String one, two;
		
		one = new String("a");
		two = new String("a");
		System.out.println(one == two);
		
		String three = "a";
		String four = "a";
		System.out.println(three == four);
	}
}
