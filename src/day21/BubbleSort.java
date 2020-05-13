package day21;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		bubbleSort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void bubbleSort(int[] numArr) {
		int swapCount = 0;
		do {
			
			swapCount = 0;
			for(int i = 0; i < numArr.length - 1; i++) {
				boolean isSwapped = inOrderSwap(i, i + 1, numArr);
				
				if(isSwapped) {
					swapCount++;
				}
				
			}
			
		}while(swapCount != 0);
		
	}
	
	public static boolean inOrderSwap(int firstIndex, int secondIndex, int[] numArr) {
		// check if they are in order if not swap and return true
		
		// if they are not in order
		if(numArr[firstIndex] > numArr[secondIndex]) {
			int temp = numArr[firstIndex];
			numArr[firstIndex] = numArr[secondIndex];
			numArr[secondIndex] = temp;
			return true;
		}
		
		return false;
	}
	
}
