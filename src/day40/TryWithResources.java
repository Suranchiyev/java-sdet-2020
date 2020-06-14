package day40;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("C:/Users/Beknazar/Desktop/notes.txt");
		
		// try catch statement with resources try(resource declaration)
		// it will automatically close the resource
		try(InputStream in = new FileInputStream(file)) {
			
			int b;
			while((b = in.read()) != -1) {
				System.out.print((char)b);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
