package day24;

import java.util.Arrays;

public class WordEnds {
	public static void main(String[] args) {
		//                     0123456789112
		String res = wordEnds("Hi", "XY"); // c13i
		System.out.println(res);
	}

	public static String wordEnds(String str, String word) {
		String res = "";
		
		String counter = "";
	
		for(int i = 0; i < str.length() - word.length() + 1; i++) {
			if(str.substring(i, word.length() + i).equals(word)) {
				counter += (i + ",");
			}
		}
		
		counter = counter.isEmpty() ? counter : counter.substring(0, counter.length() - 1);
		String[] wIndexes = counter.contains(",") ? counter.split(",") : new String[0] ;
		
		for(int i = 0; i < wIndexes.length; i++) {
			
			int index = Integer.parseInt(wIndexes[i]);
			if(index == 0) {			
				res += str.charAt(index + word.length());				
			}else if(index == str.length() - word.length()) {				
				res += str.charAt(index - 1);
			}else {
				res += String.valueOf(str.charAt(index - 1)) + str.charAt(index + word.length());
			}		
		}
		
		return res;
	}
}
