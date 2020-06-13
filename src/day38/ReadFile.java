package day38;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		readFile("C:/Users/Beknazar/Desktop/notes.txt");
	}
	
	public static void readFile(String pathToFile) {
		try {
			
			File file = new File(pathToFile);	
			FileReader fReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fReader);
			br.lines().forEach(line -> System.out.println(line));
			
		}catch (FileNotFoundException e) {

			System.out.println("File not found: " + pathToFile);
			
		}catch(Exception e) {		
			System.out.println("Error file reading file: " + e);
			
		}finally {
			System.out.println("-- finally --");
			// finally block is always will be executed 
			// most of the time it used to close some resources (files, data base connection)
		}
	}
}
