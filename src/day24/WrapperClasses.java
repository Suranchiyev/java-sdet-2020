package day24;

public class WrapperClasses {
	public static void main(String[] args) {
		// Byte 
		// Short
		// Integer
		// Long
		// Float
		// Double
		// Character
		// Boolean
		
		Byte b = 5;
		System.out.println(b + 10);
		
		Short sh = 100;
		
		Integer num = 190;
		System.out.println(num);
		
		int num1 = 120;
//		num1. compile error, primitives dont have a methods
		
		System.out.println("Max value for int/Integer: " + num.MAX_VALUE);
		System.out.println("Min value for int/Integer: " + num.MIN_VALUE);
		
		String str = "123";
		int num2 = Integer.parseInt(str);
		
		Character ch = 'a';
		System.out.println(ch);
		
		Boolean bool = false;
		
		byte bNum = 10;
		Byte b1 = new Byte(bNum);
		
		Integer num3 = new Integer(235);
		
	}
}
