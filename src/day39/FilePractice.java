package day39;

import java.io.File;

public class FilePractice {
	public static void main(String[] args) {
		// MAC: "/Users/<youUserId>/Desktop/notes.txt"
		
		File myFile = new File("C:/Users/Beknazar/Desktop/notes.txt");
		
		System.out.println("File exists: " + myFile.exists());
		System.out.println("File name: " + myFile.getName());
		System.out.println("Path: " + myFile.getAbsolutePath());
		
		System.out.println("IS FILE: " + myFile.isFile());
		System.out.println("IS DIRECTORY: " + myFile.isDirectory());
		
		// 1.61 KB (1,649 bytes)
		System.out.println("Size(bytes): " + myFile.length());
		
		// Last modification date - epoch 
		// We can convert to regular date time 
		System.out.println("Last Modification: " + myFile.lastModified());
		
		File desktop = new File("C:/Users/Beknazar/Desktop");
		System.out.println(desktop.isDirectory());
		System.out.println(desktop.length());
	}
}
