package day40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	public static void main(String[] args) {
//		File file = new File("C:/Users/Beknazar/Desktop/notes.txt");
//		
//		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
//			
//			String line;
//			while((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		List<String> content = getContent("C:/Users/Beknazar/Desktop/notes.txt");
		System.out.println(content.get(0));
		System.out.println(content.get(content.size() - 1));
	}
	
	public static List<String> getContent(String filePath) {
		List<String> content = new ArrayList<>();
		
		File file = new File(filePath);
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line;
			while((line = reader.readLine()) != null) {
				content.add(line);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return content;
	}
}
