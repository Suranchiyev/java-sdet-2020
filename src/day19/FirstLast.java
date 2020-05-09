package day19;

public class FirstLast {
	public static void main(String[] args) {
		//               0   1    2    3   4    5     6  7   
		double[] temp = {32, 30, 25.7, 26, 34, 31.5, 29, 31};
		
		int size = temp.length;
		System.out.println("Number of elements: " + size);
		System.out.println("Last element: " + temp[temp.length - 1]);
		
		double sumOfFAndL = firstLast(temp);
		System.out.println("First and Last: " + sumOfFAndL); // 63.0
	}
	
	public static double firstLast(double[] numArr) {	
		double res = numArr[0] + numArr[numArr.length - 1];
		return res;
	}
}
