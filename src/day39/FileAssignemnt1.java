package day39;

import java.io.File;
import java.io.IOException;

public class FileAssignemnt1 {
	public static void main(String[] args) {
		try {
			create("C:/Users/Beknazar/Desktop/test");
		}catch(IOException e) {
			
		}
	}
	
	public static void create(String fileRootPath) throws IOException {
		File sdet = new File(fileRootPath);
		System.out.println(sdet);
		sdet.mkdir();
		
		// file.mkdir() - to create a directory/folder
		// file.createNewFile() - to create a file
		// file.getAbsolutePath() - to get full path to the file/directory
		
		File src = new File(sdet.getAbsolutePath() + "/src");
		src.mkdir();
		
		File target = new File(sdet.getAbsolutePath() + "/target");
		target.mkdir();
		
		File pomFile = new File(sdet.getAbsolutePath() + "/pom.xml");
		pomFile.createNewFile();
				
		File helloFile = new File(src.getAbsolutePath() + "/hello.txt");
		helloFile.createNewFile();
		
		File oopFile = new File(src.getAbsolutePath() + "/oop.txt");
		oopFile.createNewFile();
		
		File testFile = new File(target.getAbsolutePath() + "/test.xlsx");
		testFile.createNewFile();
	}
}
