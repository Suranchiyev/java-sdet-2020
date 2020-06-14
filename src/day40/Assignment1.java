package day40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment1 {
	public static void main(String[] args) {
		
		// 1. There is a file with some content
		// 2. Count how many words in the file - article.txt -> split be space		
		// 3. {"I"=5, "hello"=3, "apple"=10} - each word is a key and value is how many time it appears in the text
		
		List<String> content = getContent("C:/Users/Beknazar/Desktop/article.txt");
			
		int numberOfWords = 0;		
		Map<String, Integer> words = new HashMap<>();
		
		for(String line : content) {			
			 int wordsInLine = line.split(" ").length;
			 numberOfWords += wordsInLine;
			 
			 for(String word : line.split(" ")) {
				 if(word.isEmpty() || word.equals("?") || word.equals(".") || word.equals(",")) {
					 continue;
				 }
					 
				 if(words.containsKey(word)) {
					 words.put(word, words.get(word) + 1);
				 }else {
					 words.put(word, 1);
				 }
				 
			 }
		}
		
	    System.out.println("Number of words: " + numberOfWords);
	    System.out.println(words);
	    
	    
	}
	
	public static List<String> getContent(String path) {
		// [line][line]
		List<String> content = new ArrayList<String>();
		
		File file = new File(path);
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line;
			while((line = reader.readLine()) != null) {
				content.add(line);
			}
			
		}catch(IOException e) {
			
		}
		
		return content;
	}
	
	
}
