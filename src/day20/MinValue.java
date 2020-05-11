package day20;

public class MinValue {
	public static void main(String[] args) {
		int[] arr = {45, 2, 1, 100, 60, 78, 290, 3, 5, -1, 9, -8};
		int min = arr[0];
		
		for(int number : arr) {
			if(number < min) {
				min = number;
			}
		}
		
		System.out.println(min); // -1
	}
}
