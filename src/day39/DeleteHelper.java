package day39;

import java.io.File;

public class DeleteHelper {
	public static void main(String[] args) {
		deleteAll("C:/Users/Beknazar/Desktop/tmp");
	}
	
	public static void deleteAll(String path) {
		File dir = new File(path);
		
		// if we delete non empty folder it will return false 
		if(!dir.delete()) {
			File[] files = dir.listFiles();
			for(File file : files) {
				deleteAll(file.getAbsolutePath());
			}
			
			// in the end we need to delete directory as well
			dir.delete();
		}
		
		System.out.println(dir.getAbsolutePath() + " : DELETED.");
	}
}
