package day24;

public class Varargs {
	public static void main(String[] args) {
		int num = sum(2, 3);
		System.out.println("Sum 1: " + num);
		
		int num1 = sum(7, 8, 3); 
		System.out.println("Sum 2: " + num1);
		
		int num2 = sum(9, 8, 9, 5);
		
		int[] arr = {5, 6, 3, 2, 6, 7, 3};
		int num3 = sum(arr);
	}
	
	public static int sum(int num, int num1) {
		return num + num1;
	}
	
	public static int sum(int num, int num1, int num2) {
		return num + num1 + num2;
	}
	
	public static int sum(int num, int num1, int num2, int num3) {
		return num + num1 + num2 + num3;
	}
	
	public static int sum(int[] numArr) {
		int sum = 0;
		for(int num : numArr) {
			sum += num;
		}
		return sum;
	}
}
