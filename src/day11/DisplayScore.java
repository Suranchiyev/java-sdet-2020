package day11;

public class DisplayScore {
	public static void main(String[] args) {
		displayScore(Grade.A);
		
		Grade grade = Grade.F;
		displayScore(grade);
		
		String gradeStr = grade.toString();
		System.out.println(gradeStr);
	}
	
	public static void displayScore(Grade grade) {
		// if grade is A then print: your score was between 90 and 100
		// if grade is B then print: your score was between 65 and 90
		// if grade is C: your score was between 50 and 65
		// if grade is F: your score was less than 50
		
		if(grade.equals(Grade.A)) {
			System.out.println("your score was between 90 and 100");
		}else if(grade.equals(Grade.B)) {
			System.out.println("your score was between 65 and 90");
		}else if(grade.equals(Grade.C)) {
			System.out.println("your score was between 50 and 65");
		}else if(grade.equals(Grade.F)){
			System.out.println("your score was less than 50");
		}
	}
}
