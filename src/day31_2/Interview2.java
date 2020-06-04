package day31_2;

import java.util.LinkedHashSet;
import java.util.Set;


public class Interview2 {
	public static void main(String[] args) {
		String str = "hello";
		
		str = removeDup(str);
		System.out.println(str); // helo
		
		System.out.println(removeDup("apple"));
		// apple  -> aple
		
		System.out.println(removeDup("aaaaa"));
		// aaaaaa -> a
		
		System.out.println("---------");
		System.out.println(removeDup2("hello"));
		System.out.println(removeDup2("apple"));
		System.out.println(removeDup2("aaaaa"));
		// Set 
		// contains()
	
	}
	
	public static String removeDup(String str) {
		String res = "";
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		// [h][e][l][o]
		for(char ch : set) {
			res += ch;
		}
		
		return res;
	}
	
	public static String removeDup2(String str) {
		// hello
		String res = "";
		//              : [h][e][l][l][o]
		for(char letter : str.toCharArray()) {
			//   ""
			// !"hel".contains("l")
			if(!res.contains(String.valueOf(letter))) {
			//  helo  
				res += letter;
			}	
		}
		return res;
	}
	
}
