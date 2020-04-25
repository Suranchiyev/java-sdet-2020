package day10;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		// .length(); returns number of letters in the String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type new password: ");
		
		String password = sc.next();
		int passwordLen = password.length(); 
		
		if(passwordLen < 5) {
			System.out.println("Rejected - Weak Password");
		}else if(passwordLen >= 5 && passwordLen <= 10) {
			//  5 - 10
			System.out.println("Accepted - Good Password!");
		}else {
			System.out.println("Rejected - Password to forget");
		}
	}
}
