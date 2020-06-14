package day40;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesStream {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Beknazar/Desktop/test.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		try(OutputStream out = new FileOutputStream(file)) {
			
			out.write(72); // H
			out.write(73); // I
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
