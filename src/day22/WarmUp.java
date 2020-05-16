package day22;

public class WarmUp {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7};
		System.out.println(getSumOfEven(arr)); // 12
	}
	
	public static int getSumOfEven(int[] arrNum) {		
		int sum = 0;
		
		// {1, 2, 3, 4, 6, 7}
		
		for(int i = 0; i < arrNum.length; i++) {
			if(arrNum[i] % 2 == 0) {
 				sum += arrNum[i];
			}
		}
		
		return sum;
	}
	
	public static int[] getAllEven(int[] arrNum) {
		int evenArrLen = 0;
		for(int num : arrNum) {
			if(num % 2 == 0) {
				evenArrLen++;
			}
		}
		
		int[] evenArr = new int[evenArrLen];
		
		int j = 0;
		for(int i = 0; i < arrNum.length; i++) {
			if(arrNum[i] % 2 == 0) {
				evenArr[j] = arrNum[i];
				j++;
			}
		}
		
		return evenArr;
		
	}
	
}
