package day19;

public class Rainbow {
	public static void main(String[] args) {
		//                  0       1          2        3       4        5          6
		//String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		
//		System.out.println(color[0]);
//		System.out.println(color[1]);
//		System.out.println(color[2]);
//		System.out.println(color[3]);
//		System.out.println(color[4]);
//		System.out.println(color[5]);
//		System.out.println(color[6]);
		
		//       0     7 < 7;  
//		for(int i = 0; i < color.length; i++) {
//			//                 color[6]
//			System.out.println(color[i]);
//		}
		
		//                  0       1          2        3       4        5          6
		String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		printArray(color);
		
		int[] numArr = {6, 4, 3, 5, 2, 4};
		printArray(numArr);
		
		double[] dArr = {1.5, 6, 7.5, 9.9, 1.1};
		printArray(dArr);
	}
	
	public static void printArray(String[] str) {
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void printArray(int[] numArr) {
		for(int i = 0; i < numArr.length; i++) {
			//                        
			System.out.println(numArr[i]);
		}
	}
	
	public static void printArray(double[] dArr) {
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	
	
	
}
