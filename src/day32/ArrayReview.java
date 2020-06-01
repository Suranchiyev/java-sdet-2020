package day32;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		// names -> [0][1][2][3]
		String[] names = new String[4];
		System.out.println(names);
		
		names[0] = "Vijay";
		names[1] = "Ramesh";
		names[2] = "Anil";
		names[3] = "Vikas";
		//              0        1        2       3
		// names -> ["Vijay"]["Ramesh"]["Anil"]["Vikas"]
		
		System.out.println(names[2]);
		
		String n = names[1];
		System.out.println(n);
		
		System.out.println("Number of elements (size): " + names.length);
		
		// length
		System.out.println(names[names.length - 1]);
		
		 
		int[] nums = {8, 3, 2, 5, 9, 2, 1};
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		// Arrays is helper class for array
		
		// sorting 
		// bauble sort
		// selection sort 
		
		// searching
		// linear search
		// binary search 
		
		//                          0            1            2
		int[][] twoDimArray = {{2, 3, 4, 5}, {8, 99, 7}, {55, 2, 0}};
		//                      0  1  2  3    0  1   2    0   1  2
		
		System.out.println(twoDimArray[1][1]);
		
		for(int i = 0; i < twoDimArray.length; i++) {
			for(int j = 0; j < twoDimArray[i].length; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
