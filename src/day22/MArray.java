package day22;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		// { [][][][] }, { [][][][] }, { [][][][] }
		
		int[][] mArr = new int[3][4];
		
		//       0               1                2
		// {[4][5][6][8]}, {[11][3][1][2]}, {[0][99][33][5]}
		//   0  1  2  3      0   1  2  3      0   1  2   3
		
		mArr[0][0] = 4;
		mArr[0][3] = 8;
		mArr[0][1] = 5;
		mArr[0][2] = 6;
		
		mArr[1][0] = 11;
		mArr[1][1] = 3;
		mArr[1][2] = 1;
		mArr[1][3] = 2;
		
		mArr[2][0] = 0;
		mArr[2][1] = 99;
		mArr[2][2] = 33;
		mArr[2][3] = 5;
		
		System.out.println(mArr.length);
		System.out.println(Arrays.toString(mArr));
		System.out.println();
		
		for(int i = 0; i < mArr.length; i++) {
			
			for(int j = 0; j < mArr[i].length; j++) {
				System.out.print(mArr[i][j] + " ");
				// sum += mArr[i][j];
			}
			
			System.out.println();	
		}
		
		System.out.println("-------------");
		
		for(int[] arr : mArr) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("-------------");
		System.out.println(Arrays.deepToString(mArr));
	}
}
