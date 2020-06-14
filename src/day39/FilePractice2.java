package day39;

import java.io.File;
import java.io.IOException;

public class FilePractice2 {
	public static void main(String[] args) throws IOException {
		
		// it points to tmp directory
		File tmpDir = new File("C:/Users/Beknazar/Desktop/tmp");
	
		if(!tmpDir.exists()) {
			System.out.println("Creating new dir");
			// mkdir to create a directory/folder
			tmpDir.mkdir();
		}
		
		System.out.println("Abs path: " + tmpDir.getAbsolutePath());
		// create new file under 'tmp' directory
		File f1 = new File(tmpDir.getAbsolutePath() + "/oop.pdf");		
		f1.createNewFile();
			
		File f2 = new File(tmpDir.getAbsolutePath() + "/slides.pdf");
		f2.createNewFile();
		
		File f3 = new File(tmpDir.getAbsolutePath() + "/cat.png");
		f3.createNewFile();
		
		File f4 = new File(tmpDir.getAbsolutePath() + "/test_cases.xlsx");
		f4.createNewFile();	
		
		boolean isDeleted = tmpDir.delete();
		System.out.println(isDeleted);
	}
}
