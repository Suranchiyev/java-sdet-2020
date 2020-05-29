package day30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterview {
	public static void main(String[] args) {
		String str = "helloool";
		// {h=1, e=1, l=3, o=3}
		Map<String, Integer> letCount = countLetters(str);
		System.out.println(letCount);
		
		
		char[] letters = {'a', 'b', 'a', 'c', 'd', 'a', 'c', 'e', 'e', 't'};
		Map<Character, Integer> charCount = charCount(letters); 
		
		// {a=3, b=1, c=2, d=1, e=2, t=1}
		System.out.println(charCount);
	}
	
	public static Map<Character, Integer> charCount(char[] letters) {
		Map<Character, Integer> charsCount = new HashMap<>();
		
		// ['a', 'b', 'a', 'c', 'd', 'a', 'c', 'e', 'e', 't']
		for(int i = 0; i < letters.length; i++) {
			//        t
			Character ch = letters[i];
			
			// ['a', 3]['b', 1]['c', 2]['d', 1][e, 2][t, 1]
			if(charsCount.containsKey(ch)) {
		    //                 
				charsCount.put(ch, charsCount.get(ch) + 1);
				
			}else {
				//              t, 1           
				charsCount.put(ch, 1);
			}
		}
		
		return charsCount;
	}
	
	public static Map<String, Integer> countLetters(String str) {
		Map<String, Integer> lettersCount = new LinkedHashMap<>();
		
		// helloool
		// 01234567 
		//             3 < 8
		for(int i = 0; i < str.length(); i++) {
			//       l                                3
			String letter = String.valueOf(str.charAt(i));
			
			//["h", 1]["e", 1]["l", 3]["o", 3]
			if(lettersCount.containsKey(letter)) {
				lettersCount.put(letter, lettersCount.get(letter) + 1);
			}else {
				lettersCount.put(letter, 1);
			}
		}
		
		return lettersCount;
	}
	
	
}
