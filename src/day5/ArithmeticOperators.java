package day5;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// Data type output from expressions
		// byte -> short -> int -> long -> float -> double

		int num = 66;
		double dNum = 4.9;
		//          (int)(int + double)
		int res =  (int) (num + dNum);
		System.out.println(res);

		int lNum = 999999;
		//float fNum = 423.5F;
		short shNum = 5;
        //          int  *  short        
		int res2 = lNum  * shNum;


		byte bNum = 5;
		short sh1 = 14;
        //           short
		int num2 = sh1 - bNum;

        //   b =  (byte)   int
		byte b = (byte) (num2 + bNum);
		System.out.println(b);

	}
}