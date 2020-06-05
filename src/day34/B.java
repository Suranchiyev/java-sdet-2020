package day34;

import java.util.List;

public class B extends A{
	// Override all the method from class A
	// 10 min
	
	@Override
	public String reverseStr(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	@Override
	public void printHello() {
		System.out.println("Hello");
	}
	
	@Override
	public double sum(double[] arr) {
		double sum = 0.0;
		for(double el : arr) {
			sum += el;
		}
		return sum;
	}
	
	@Override
	public int getMin(int[] numArr) {
		int min = numArr[0];
		for(int num : numArr) {
			if(min > num) {
				min = num;
			}
		}
		
		return min;
	}
	
	@Override
	public int getMax(List<Integer> numList) {
		int max = numList.get(0);
		for(int num : numList) {
			if(max < num) {
				max = num;
			}
		}
		
		return max;
	}
	
}
