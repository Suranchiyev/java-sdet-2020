package day9;

public class MathClass2 {
	public static void main(String[] args) {
		int res = Calculator.sum(55, 4);
		System.out.println(res);
		
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.division(15, 5));
		
		System.out.println(Calculator.sum(1.99, 2.88));
		
		String str = Calculator.concat("apple", "banana");
		System.out.println(str); // applebanana
		
		String str1 = Calculator.makeStr("apple");
		System.out.println(str1); // <>hello</>
		
		String str2 = Calculator.makeStr("hello", "p");
		System.out.println(str2); // <p>hello</p>
		
		System.out.println(Calculator.makeStr("apple","x"));
		// <x>apple</x>
		
		System.out.println(Calculator.makeStr("car","LOL"));
		
	}
}
