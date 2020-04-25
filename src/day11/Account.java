package day11;
import java.util.Scanner;

public class Account {
	public static final String EMAIL = "john@gmail.com";
	public static final String PASSWORD = "qwerty1$";
	
	public static void main(String[] args) {
       System.out.println("----- Log in -----");
       
       if(isValidCred()) {
    	   System.out.println("Succesfully loged in:");
    	   System.out.println("Name: John Doe");
       }else if(isValidCred()) {
    	   System.out.println("Succesfully loged in:");
    	   System.out.println("Name: John Doe");
       }else if(isValidCred()) {
    	   System.out.println("Succesfully loged in:");
    	   System.out.println("Name: John Doe");
       }else {
    	   System.out.println("Please try later. Login functionality is blocked");
       }
	}
	
	public static boolean isValidCred() {
		Scanner scanner = new Scanner(System.in);
		String providedEmail;
		String providedPassword;
		
		System.out.println("Email:");
		providedEmail = scanner.next().toLowerCase();
		
		System.out.println("Password:");
		providedPassword = scanner.next();
		
		if(EMAIL.equals(providedEmail) && PASSWORD.equals(providedPassword)) {
			return true;
		}else {
			System.out.println("Worng email or password");
			return false;
		}	
	}
}
