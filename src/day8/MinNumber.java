package day8;

public class MinNumber {
	public static void main(String[] args) {
		int res = getMin(2, 4); 
		System.out.println(res); // 2
		
		res = getMin(8, 3);
		System.out.println(res); // 3
		
		res = getMin(-2, 1, -6);   // 1
		System.out.println(res);
		
		res = getMin(1, -2, 3, 99);
		System.out.println(res); // -2
	}
	
	public static int getMin(int numOne, int numTwo) {
		if(numOne < numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	
	public static int getMin(int numOne, int numTwo, int numThree) {
		// get smallest number from: numOne, numTwo, numThree
		// try to use if else statements and logical && and operator
		if(numOne < numTwo && numOne < numThree) {
			return numOne;
		}else if(numTwo < numOne && numTwo < numThree) {
			return numTwo;
		}else {
			return numThree;
		}
	}
	
	//                            2           1           8              3
	public static int getMin(int numOne, int numTwo, int numThree, int numFour) {
		// get smallest number from: numOne, numTwo, numThree, numFour
		// try to reuse getMin(int numOne, int numTwo);
		//       1                     2   ,   1
		int minOfTwoFirst = getMin(numOne, numTwo);
		//       3                     8   ,   3
		int minOfTwoSecond = getMin(numThree, numFour);
		//    1                1       ,      3
		int min = getMin(minOfTwoFirst, minOfTwoSecond);
		return min;
	}
	
	
}
