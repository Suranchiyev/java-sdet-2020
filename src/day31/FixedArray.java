package day31;

public class FixedArray {
	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		// ...
		
		
		int[] nums1 = new int[4];
		
		for(int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
		
		nums1[3] = 4;
		
		nums = nums1;
	  
		
	}
}
