package day44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountChallenges {
	public static void main(String[] args) {
		System.out.println(countLetters("hello")); // {{'h',1}{'e',1}{'l',1}{'o',1}}
		System.out.println(countLetters("aaaaa"));
		
		System.out.println(cntLettersStr("hello"));
		System.out.println(cntLettersStr("aauuahhh"));
		
		System.out.println(cntWords("hi hi hi apple apple orange"));
		
		System.out.println("--------");
		System.out.println(cntWordsFile("C:/Users/Beknazar/Desktop/notes.txt"));
		
	}
	
	/*
	 * countLetters("hello")    -> {{'h', 1}, {'e', 1}, {'l', 2}, {'o', 1}}
	 * countLetters("aauuchhha") -> {{'a', 3}, {'u', 2}, {'c', 1}, {'h', 3}}
	 * Time Complexity: O(n)
	 */
	public static Map<Character, Integer> countLetters(String str) {
		// map to store letters (K, V)
		Map<Character, Integer> lettersMap = new HashMap<>();
		
		// loop to go over the input String
		for(char ch : str.toCharArray()) {
			// if map already contains the key, get the value and put with +1
			if(lettersMap.containsKey(ch)) {				
				lettersMap.put(ch, lettersMap.get(ch) + 1);
			}else {
				// new letter put with value 1
				lettersMap.put(ch, 1);
			}
    	}
		
		return lettersMap;
	}
	
	/*
	 * cntLettersStr("hello") -> "h1e1l2o1"
	 * cntLettersStr("aauuahhh") -> a3u2h3
	 * cntLettersStr("tttt")     -> "t4"
	 * O(n)
	 */
	public static String cntLettersStr(String str) {
		String lettersStr = "";
		Map<Character, Integer> lettersMap = new LinkedHashMap<>();
		
		// Loop to go over input String
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);		
			// if map already contains the key, get the value and put with +1
			if(lettersMap.containsKey(letter)) {
				lettersMap.put(letter, lettersMap.get(letter) + 1);
			} else {
				// new letter put with 1
				lettersMap.put(letter, 1);
			}
		}
		
		// convert map to String based on requirement 
		for(char letterKey : lettersMap.keySet()) {
			lettersStr += String.valueOf(letterKey) + lettersMap.get(letterKey);
		}
		
		return lettersStr;
	}
	
	
	/*
	 * cntWords("hi hi hi apple") -> {{"hi", 3}, {"apple", 1}}
	 * cntWords("Ok apple Ok orange") -> {{"Ok", 2}, {"apple", 1}, {"orange", 1}}
	 * O(n)
	 */
	public static Map<String, Integer> cntWords(String str) {
		// split str input by " " to get String[] as words
		String[] words = str.split(" ");

		// Follow the same logic other count with Map
		Map<String, Integer> mapWords = new HashMap<>();	
		for(String word : words) {
			if(mapWords.containsKey(word)) {
				mapWords.put(word, mapWords.get(word) + 1);
			}else {
				mapWords.put(word, 1);
			}
		}
		
		return mapWords;
	}
	
	
	/*
	 * Write the program that will count appearance of each word from your resume
	 * and return as map. Key is a each word and value is appearance
	 * O(n^2)
	 */
	public static Map<String, Integer> cntWordsFile(String path) {
		Map<String, Integer> words = new HashMap<>();
		
		File file = new File(path);
		try(BufferedReader bReader = new BufferedReader(new FileReader(file))) {
			
			String line;
			while((line = bReader.readLine()) != null) {
				
				for(String lineWord : line.split(" ")) {
					if(!lineWord.trim().isEmpty()) {
						
						lineWord = lineWord.trim();
						if(words.containsKey(lineWord)) {
							words.put(lineWord, words.get(lineWord) + 1);
						}else {
							words.put(lineWord, 1);
						}

					}
				}
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return words;
	}
	
}
