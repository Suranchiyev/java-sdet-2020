package day39;

import java.io.File;

public class FilePractice3 {
	public static void main(String[] args) {
		File dir = new File("C:/Users/Beknazar/Desktop/sdet");
		
		if(dir.isDirectory()) {
			// listFiles will return the files inside directory as File[] array
			File[] filesInside = dir.listFiles();
			
			for(File file : filesInside) {
				if(file.isFile()) {
					System.out.println(file.getName());
				}else {
					
					File[] filesInside2 = file.listFiles();
					for(File file2 : filesInside2) {
						if(file2.isFile()) {
							System.out.println(file2.getName());
						}
					}
					
				}
				
			}
		}
	}
}
