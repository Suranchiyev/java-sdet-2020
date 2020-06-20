package day43;

import java.util.Arrays;

public class MaxMinChallenges {
	public static void main(String[] args) {
		int[] arrNum = {4, 781, 8, 99, 103};
		System.out.println(max(arrNum));
		System.out.println(max1(arrNum));
		System.out.println(max2(arrNum));
		
		int[] arrNum1 = {5, 67, 8, 9, 13};
		System.out.println(min(arrNum1));
		System.out.println(secMax2(arrNum1));
		
		System.out.println(Arrays.toString(nMax(arrNum1, 2)));
	}
	
	/*
	 * max({4, 781, 8, 99, 103}) -> 781
	 * Brute Force Algorithms - not best option
	 * Time Complexity: O(n^2)
	 */
	public static int max(int[] numArr) {
		
		for(int i = 0; i < numArr.length; i++) {
			boolean isBiggest = true;
			
			for(int j = 0; j < numArr.length; j++) {
				if(numArr[i] < numArr[j]) {
					isBiggest = false;
					break;
				}
			}
			
			if(isBiggest) {
				return numArr[i];
			}
		}
		
		return 0;
	}
	
	/*
	 * max({4, 781, 8, 99, 103}) -> 781
	 * {4, 8, 99, 103, 781} -> 781
	 * Sort and get last one
	 * Time Complexity: O(n^2)
	 */
	public static int max1(int[] numArr) {
		Arrays.sort(numArr);
		return numArr[numArr.length - 1];
	}
	
	
	/*
	 * max({4, 781, 8, 99, 103}) -> 781
	 * Time Complexity: O(n)
	 */
	public static int max2(int[] numArr) {
		// assume first element is a biggest el in array
		int max = numArr[0]; 
		
		// loop over the array and test assumption
		for(int i = 0; i < numArr.length; i++) {
			// if max was not biggest, update it
			if(max < numArr[i]) {
				max = numArr[i];
			}		
		}
		
		return max;
	}
	
	
	/*
	 * min({5, 67, 8, 9, 1}) -> 1
	 */
	public static int min(int[] arrNum) {
		// assume first one is smallest in the array
		int min = arrNum[0];
		
		// test assumption 
		for(int num : arrNum) {
			// if min was not the smallest, update it
			if(min > num) {
				min = num;
			}
		}
		
		return min;
	}
	
	
	
	/*
	 * Find second max number from array
	 * secMax({4, 781, 8, 9, 103}) -> 103
	 * O(n^2) sort is expensive 
	 */
	public static int secMax(int[] numArr) {
		Arrays.sort(numArr);
		// {4, 8, 9, 103, 781}
		
		return numArr[numArr.length - 2];
	}
	
	
	/*
	 * Find second max number from array
	 * secMax2({4, 781, 8, 9, 103}) -> 103
	 * O(2n) -> O(n)
	 */
	public static int secMax2(int[] numArr) {
		int max = numArr[0];
		int secMax = numArr[0];
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		
		for(int i = 0; i < numArr.length; i++) {
			if(secMax < numArr[i] && numArr[i] != max) {
				secMax = numArr[i];
			}
		}
		
		return secMax;
	}
	
	
	/*
	 * Find n max numbers from array
	 * nMax({4, 781, 8, 9, 103}, 3) -> {9, 103, 781}
	 * nMax({6, 2, 3, 5, 102}, 2)  -> {6, 102}
	 */
	public static int[] nMax(int[] numArr, int n) {
		Arrays.sort(numArr);
		int[] nArr = new int[n];
		
		int j = numArr.length - 1;
		for(int i = 0; i < n; i++) {
			nArr[i] = numArr[j - i];
		}
		
		return nArr;
	}

}
