package day12;

public class Grade {
	public static void main(String[] args) {
		displayScore('a'); // Your score was between 90 and 100
		displayScore('A'); // Your score was between 90 and 100
		
		displayScore('F'); // Your score was less than 50
		
		displayScore('C'); // Your score was between 50 and 65
	}
	
	public static void displayScore(char grade) {
		// if grade is 'A' or 'a' then print: Your score was between 90 and 100
		// if grade is 'B' or 'b' then print: Your score was between 65 and 90
		// if grade is 'C' or 'c' then print: Your score was between 50 and 65
		// if grade is 'F' or 'f' then print: Your score was less than 50
		// otherwise print: Not valid grade
		// Use switch statement
		// Share your code via slack
		
		switch(grade) {
		case 'A':
		case 'a':	
			System.out.println(grade + ": Your score was between 90 and 100");
			break;
		case 'B':
		case 'b':
			System.out.println(grade + ": Your score was between 65 and 90");
			break;
		case 'C':
		case 'c':
			System.out.println(grade + ": Your score was between 50 and 65");
			break;
		case 'F':
		case 'f':
			System.out.println(grade + ": Your score was less than 50");
			break;
		default:
			System.out.println("Not valid grade");
			break;
		}
	}
}
