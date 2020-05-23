package day27;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		String str = "hello"; // helo
		// str = removeDupStr(str);
		str = removeDupStr1(str);
		System.out.println(str);
		
	}
	
	public static String removeDupStr1(String str) {
		//      helo
		String resStr = "";
		// hello
		for(int i = 0; i < str.length(); i++) {
			 //     "o"
			String letter = String.valueOf(str.charAt(i));
			 //  !"helo".c("o")
			if(!resStr.contains(letter)) {
				resStr += letter;
			}
		}
		
		return resStr;
	}
	
	public static String removeDupStr(String str) {
		String strNoDup = "";
		// convert string to char[]
		char[] letters = str.toCharArray();
		
		// create Set (LinkedHashSet)
		Set<Character> set = new LinkedHashSet();
		
		// Add all elements from char[] to set
		for(char ch : letters) {
			set.add(ch);
		}
		
		// convert back to String from Set
		for(Character ch : set) {
			strNoDup += ch;
		}
		
		return strNoDup;
	}
	
	public ArrayList<String> removeDupList(ArrayList<String> list) {
		Set<String> setList = new LinkedHashSet<>(list);
		
		list.clear();
		
		for(String el : setList) {
			list.add(el);
		}
		
		return list;
	}
}
