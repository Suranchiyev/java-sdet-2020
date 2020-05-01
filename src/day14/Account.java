package day14;
import java.util.Scanner;

public class Account {
	public static final String EMAIL = "john@gmail.com";
	public static final String PASSWORD = "12345a";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String providedEmail;
		String providedPassword;
		boolean isValidUser = false;
		int count = 0;
		
		do {
			System.out.println("Email: ");
			providedEmail = sc.next();
			
			System.out.println("Password: ");
			providedPassword = sc.next();
			
			isValidUser = providedEmail.equalsIgnoreCase(EMAIL) && providedPassword.equals(PASSWORD);
			
			count++;
			
		} while(!isValidUser && count < 3);
		
		if(count >= 3) {
			System.out.println("Try later. System has been blocked");
		} else if(isValidUser) {
			System.out.println("Successfully loged in");
		} else {
			System.out.println("Some thing went wrong");
		}
	}
}
