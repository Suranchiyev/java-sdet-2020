package day8;

public class Score {
	public static void main(String[] args) {
		char grade = 'C';
		String scoreMessage;
		
		if(grade == 'A') {
			scoreMessage = "Your score more than 90";
		}else if(grade == 'B') {
			scoreMessage = "Your score within 80 - 90 range";
		}else if(grade == 'C') {
			scoreMessage = "Your score within 70 - 80 range";
		}else if(grade == 'D') {
			scoreMessage = "Your score within 60 - 70";
		}else if(grade == 'F') {
			scoreMessage = "You score is less than 60";
		}else {
			scoreMessage = "NOT VALID GRADE(it can be: A, B, C, D, F)";
		}
		
		System.out.println("Grade = " + grade);
		System.out.println("Score Message = " + scoreMessage);
	}
}
