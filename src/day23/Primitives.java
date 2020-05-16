package day23;

public class Primitives {
	public static void main(String[] args) {
		byte bNum = 5;
		short shNum = 88;
		int num = 100;
		long lNum = 1000;
		
		float fNum = 5.6f;
		double dNum = 8.99;
		
		char ch = 'U';
		boolean bFlag = false;
		
		// byte -> short -> int -> long -> float -> double
		byte bNum1 = 99;
		int num1 = bNum1; // auto casting here. byte is smaller than int so it will be auto casting
		
		short shNum1 = (short)num1; // casting from int to short
		
		char ch1 = 'a';
		char ch2 = 'b';
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
	}
}
