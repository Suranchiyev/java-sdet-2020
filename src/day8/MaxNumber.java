package day8;

public class MaxNumber {
	public static void main(String[] args) {
		System.out.println(getMax(1, 2)); // 2
		System.out.println(getMax(5, 3)); // 5
		System.out.println(getMax(9, 11, 3, 6)); // 11
		System.out.println(getMax(9, 11, 3, 16)); // 16
	}
	
	public static int getMax(int numOne, int numTwo) {
		if (numOne > numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	
	public static int getMax(int numOne, int numTwo, int numThree, int numFour) {
		int maxOne = getMax(numOne, numTwo);
		int maxTwo = getMax(numThree, numFour);
		int max = getMax(maxOne, maxTwo);
		return max;
	}
	
}
