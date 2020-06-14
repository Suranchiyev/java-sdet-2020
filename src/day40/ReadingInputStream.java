package day40;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingInputStream {
	public static void main(String[] args) {
		File file = new File("C:/Users/Beknazar/Desktop/notes.txt");
		
		InputStream in = null;
		
		try {		
			in = new FileInputStream(file);
			
			int b;
			while((b = in.read()) != -1) {
				System.out.print((char)b);
				//b = in.read();
			}
			
			// in.close();
							
		}catch(IOException e) {			
			System.out.println(e.getMessage());
		} finally {
			try {
				System.out.println("Closing stream..");
				if(in != null) {
					in.close();
				}			
			}catch(IOException e1) {
				System.out.println("Error while closing stream");
			}				
		}
	}
}
