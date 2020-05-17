package day24;

public class PassByVal {
	public static void main(String[] args) {
		// all the primitives are pass by value
		// String is pass by value because its immutable 
		
		int num = 9;
		changeVal(num);
		System.out.println(num);
		
		
		String str = "orange";
		changeVal(str);
		System.out.println(str);
		
		char ch = 'a';
		chaneVal(ch);
		System.out.println(ch);
	}
	
	public static void chaneVal(char ch) {
		ch = 'b';
	}
	
	public static void changeVal(int num) {
		num = 10;
	}
	
	public static void changeVal(String str) {
		str = "apple";
	}
}
