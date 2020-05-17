package day24;
import java.util.Scanner;

public class ConsoleInput {
	private Scanner scanner;
	
	public ConsoleInput() {
		scanner = new Scanner(System.in);
	}
	
	public String getStr() {
		return scanner.next();
	}
	
	public String next() {
		return scanner.next();
	}
	
	//..
}
