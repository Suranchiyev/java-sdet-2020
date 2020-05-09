package day19;

public class Score {
	public static void main(String[] args) {
		int[] score = new int[5];
		//           0   1   2   3  4     
		//  score: [70][80][90][75][80]  
		
		score[0] = 70;
		score[1] = 80;
		score[2] = 90;
		score[3] = 75;
		score[4] = 80;
		
		//   6th does not exist, we will get ArrayIndexOutOfBoundsException
		// score[5] = 100;
		
		System.out.println("Index 0: " + score[0]);
		System.out.println("Index 1: " + score[1]);
		System.out.println("Index 2: " + score[2]);
		System.out.println("Index 3: " + score[3]);
		System.out.println("Index 4: " + score[4]);
		
		// System.out.println("Index 5: " + score[5]);
		
		// [70][150][90]75][80]
		score[1] = score[0] + score[4];		
		System.out.println(score[1]);
		System.out.println(score[0]);
		System.out.println(score[4]);
		
		score[1] = 50;
		System.out.println(score[1]);
	}
}
