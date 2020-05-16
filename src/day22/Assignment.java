package day22;

public class Assignment {
	public static void main(String[] args) {
		int[][] numArr = {
				{1531, 1113, 1124, 1134, 1145}, 
				{1158, 1191, 1208, 1225, 1242}, 
				{1216, 1174, 1191, 1208, 1225}, 
				{1276, 1262, 1286, 1311, 1335},
				{1340, 1338, 1370, 1403, 1436}
				};
		
		System.out.println("Sum of all elements: " + sumOfAll(numArr));
		System.out.println("Average: " + average(numArr)); // 1257
		
	}
	
	public static int sumOfAll(int[][] twoDimArr) {
		int sum = 0;
		for(int i = 0; i < twoDimArr.length; i++) {
			for(int j = 0; j < twoDimArr[i].length; j++) {
				sum += twoDimArr[i][j];
			}
		}
		
		return sum;
	}
	
	public static int average(int[][] twoDimArr) {
		int numberOfElements = 0;
		int sum = 0; 
		
//		for(int[] arr : twoDimArr) {		
//			numberOfElements += arr.length;			
//			for(int number : arr) {
//				sum += number;			
//			}
//		}
		
		for(int i = 0; i < twoDimArr.length; i++) {
			numberOfElements += twoDimArr[i].length;	
			for(int j = 0; j < twoDimArr[i].length; j++) {
				sum += twoDimArr[i][j];	
			}
		}
	
		return sum / numberOfElements;
	}
}
