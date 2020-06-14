package day39;

import java.io.IOException;

public class ExceptionAssignment2 {
	public static void main(String[] args) {
		try {
			m();
		}catch(IOException e) {
			System.out.println("Exception is handled");	
		}		
	}
	
	public static void m() throws IOException {
		throw new IOException();
	}
}
