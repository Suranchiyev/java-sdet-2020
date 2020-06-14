package day39;

import java.io.File;

public class FileCounter {
	private int count = 0;
	
	public int countFile(String path) {	
		File dir = new File(path);
		
		if(dir.isDirectory()) {
			File[] files = dir.listFiles();
			
			if(files != null) {
				
				for(File file : files) {
					if(file.isFile() && file.getName().endsWith(".pdf")) {
						count++;
					}else {
						countFile(file.getAbsolutePath());
					}
				}
				
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Counting files in Desktop:");
		FileCounter fileCounter = new FileCounter();
		File desktop = new File("C:/Users/Beknazar/Desktop");
		if(desktop.exists()) {
			System.out.println("Number of files: " + fileCounter.countFile(desktop.getAbsolutePath()));
		}else {
			System.out.println("Wrong path");
		}
		
	}
}
