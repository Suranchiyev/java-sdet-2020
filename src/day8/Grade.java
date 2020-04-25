package day8;

public class Grade {
	public static void main(String[] args) {
		int score = 70;
		char grade = getGrade(score);
		
		System.out.println("Score = " + score);
		System.out.println("Grade = " + grade);
	}
	
	public static char getGrade(int score) {
		char grade;
		
		if(score > 90) {
			grade = 'A';
		}else if(score > 80 && score < 90) {
			grade = 'B';
		}else if(score > 70 && score < 80) {
			grade = 'C';
		}else if (score > 60 && score < 70) {
			grade = 'D';
		}else {
			grade = 'F';	
		}
		
		return grade;
	}
}
