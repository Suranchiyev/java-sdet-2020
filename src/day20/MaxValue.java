package day20;

public class MaxValue {
	public static void main(String[] args) {
		int[] arr = {45, 2, 1, 100, 60, 78, 290, 3, 5, 1, 9, 8};
		int max = arr[0];
		
		for(int num : arr) {
			// 8  > 290
			if(num > max) {
			//  290
				max = num;
			}
		}
		
		System.out.println(max);
	}
}
