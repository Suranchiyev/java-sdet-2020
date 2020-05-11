package day20;

public class WarmUp {
	public static void main(String[] args) {
		int[] nums = {3, 2, 4, 2};
		System.out.println(isSeven(nums)); // false
		
		int[] nums1 = {3, 2, 4, 2, 7, 8, 9};
		System.out.println(isSeven(nums1)); // true
		
	}
	
	/**
	 * Method will accept int[] number
	 * it will return true if array contains 7
	 * otherwise it will return false
	 * 
	 * [3, 2, 4, 2, 8, 9]
	 */
	public static boolean isSeven(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 7) {
				return true;
			}
		}
		return false;
	}
}
