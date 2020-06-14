package day40;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		System.out.println("Starting copy: ");
		copy("C:/Users/Beknazar/Desktop/scratch_practice.mp4", "C:/Users/Beknazar/Desktop/video/video_copy.mp4");
	}
	
	public static void copy(String sourcePath, String targetPath) {
		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		
		try(InputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
			OutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))) {
			
			byte[] buffer = new byte[1024];
			
			int b;
			while((b = input.read(buffer)) > 0) {
				output.write(buffer, 0, b);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
