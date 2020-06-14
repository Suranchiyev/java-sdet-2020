package day40;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment3 {
	public static void main(String[] args) throws IOException{
		
		// 1. Create file under package 40 with name Numbers
		// 2. Write to file number from 1 to 1000
		
		File file = new File("src/day40/Numbers");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {			
			for(int i = 1; i <= 1000; i++) {
				writer.write(String.valueOf(i));
				writer.newLine();
			}		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}



