package day21;

public class WarmUp {
	public static void main(String[] args) {
		//              0  1  2  3  4  5  6
		int[] numArr = {0, 8, 6, 5, 2, -1, 4};
		
		int index = getSmallestIndex(numArr);
		System.out.println(index);  // 5
		
		int[] numArr1 = {3, 5 ,7};
		System.out.println(getSmallestIndex(numArr1)); // 0
	}
	
	public static int getSmallestIndex(int[] num) {
		int min = num[0];
		int minIndex = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
}
