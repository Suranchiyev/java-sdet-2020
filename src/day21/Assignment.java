package day21;

import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {
		int[] numArr = {99, 2, 3, 50, 101};
		System.out.println(Arrays.toString(getThreeSmallest(numArr))); //[2, 3, 50]
		
		numArr = new int[] {9, 4, 0, -5, 3};
		System.out.println(Arrays.toString(getThreeSmallest(numArr))); //[-5, 0, 3]
		
		System.out.println("-------------");
		
		System.out.println(isEqual("abc", "bca")); // true
		System.out.println(isEqual("abc", "cba")); // true
		System.out.println(isEqual("abc", "abc")); // true
		System.out.println(isEqual("abc", "abe")); // false
		System.out.println(isEqual("tre", "qrt")); // false
	}
	
	// getThreeSmallest([99, 2, 3, 50, 101]); -> [2, 3, 50]
	// getThreeSmallest([9, 4, 0, -5, 3]); -> [-5, 0, 3]
	public static int[] getThreeSmallest(int[] numArr) {
		int[] arrRes = new int[3];
		
		Arrays.sort(numArr);
		
		arrRes[0] = numArr[0];
		arrRes[1] = numArr[1];
		arrRes[2] = numArr[2];
		return arrRes;
	}
	
	
	// isEqual("abc", "bca"); -> true
	// isEqual("abc", "cba"); -> true
	// isEqual("abc", "abc"); -> true
	// isEqual("abc", "abe"); -> false
	// isEqual("tre", "qrt"); -> false
	public static boolean isEqual(String str, String strOne) {
		// convert both to char[]
		// sort both char[] arrays
		// compare if they are equal if yes return true
		// otherwise return false
		
		// convert to char[]
		char[] strArr = str.toCharArray();
		char[] strOneArr = strOne.toCharArray();
		
		//sort
		Arrays.sort(strArr);
		Arrays.sort(strOneArr);
				
//		int lenght = strArr.length > strOneArr.length ? strArr.length : strOneArr.length;
//		
//		for(int i = 0; i < lenght; i++) {
//			//        1               1
//			if(strArr[i] != strOneArr[i]) {
//				return false;
//			}
//		}
		 
		return Arrays.equals(strArr, strOneArr);
	}
}
