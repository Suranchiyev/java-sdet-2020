package day40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {
	public static void main(String[] args) {
		
		// relative path will not start from the root directory
		// it's relative to the project (basically, where the program runs from)
		File file = new File("src/day40/Names");
		//System.out.println(file.exists());
		
		// can you print names from Names file that have even length
		// each name will be in the new line
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line;
			while((line = reader.readLine()) != null) {
				if(line.trim().length() % 2 == 0) {
					System.out.println(line);
				}		
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
