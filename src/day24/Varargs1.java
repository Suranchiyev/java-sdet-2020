package day24;

public class Varargs1 {
	public static void main(String[] args) {
		int num = sum(2, 4);
		System.out.println("Sum: " + num);
		
		int num1 = sum(4, 7, 8);
		System.out.println("Sum 1: " + num1);
		
		int[] arr = {5, 3, 2, 1, 7};
		int num2 = sum(arr);
		System.out.println("Sum 2: " + num2);
		
		int i, i1, i2, i3;
		i = 99;
		i1 = 8;
		i2 = 5;
		i3 = 2;
	
		System.out.println(sum(i, i1, i2, i3));
			
	}
	
	//1. Only one varargs argument can exist in the method
//	public static void maMethod(String... strs, int... nums) {
//		Not compiling
//	}
	
	//2. Varargs argument should aways as last argument
	public static void myMethod(int num, String str, int... nums) {
		
	}
	
//	public static void myMethod(String... strs, int num) {
//		Not compiling - varargs should as last argument
//	}
	
	public static int sum(int... nums) {
		// System.out.println("Element 1: " + nums[0]);
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		
		return sum;
	}
}
