package day19;

import java.util.Arrays;

public class Assignment2 {
	public static void main(String[] args) {
		String[] name = {"Isla", "Olivia", "Aurora", "Ada", "Cora"};
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("------------------");
		
		byte[] score = {9, 8, 7, 5, 5, 6, 9, 10, 11};
		double sum = 0;
	
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];			
		}
	
		System.out.println("Average is " + (sum / score.length));
		System.out.println("------------------");
		
		//                       0    1    2    3
		double[] coordinates = {3.5, 5.9, 2.1, 1.9};
		
		String str = "";
		for(int i = coordinates.length - 1; i >= 0; i--) {
			str += coordinates[i] + ", ";
		}
		System.out.println(str.substring(0, str.length() - 2));
		System.out.println("------------------");
		
		int[] number = new int[100];
		// [0][0][0][0][0]...
		// [1][2][3][4][5]...
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		System.out.println(number);
		System.out.println(Arrays.toString(number));
	}
}
