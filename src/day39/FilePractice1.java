package day39;

import java.io.File;
import java.io.IOException;

public class FilePractice1 {
	public static void main(String[] args) throws IOException {
		// MAC: "/Users/<youUserId>/Desktop/test.txt"
		
		File file = new File("C:/Users/Beknazar/Desktop/test.txt");
		
		if(file.exists()) {
			System.out.println("File is exist");
			System.out.println(file.getParent() + " : " + file.length() + " BYTES");
		}else {
			file.createNewFile();
			System.out.println("File is created: " + file.getName());
		}
		
		// we can delete files as well
		// if file is deleted it will return true
		// otherwise false
		boolean isDeleted = file.delete();
	}
}
