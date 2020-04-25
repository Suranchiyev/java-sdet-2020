package day10;

public class StrIndexOf {
	public static void main(String[] args) {
		/**
		 * indexOf(string)
		 * idnexOf(char)     -> to get a index of certain string
		 */
		
		//            01234567
		String str = "applpepp";
		int index = str.indexOf("e");
		System.out.println(index); // 4
		
		System.out.println(str.indexOf("l")); // 3
		System.out.println(str.indexOf("p")); // 1
		System.out.println(str.lastIndexOf("p")); // 7 start looking for a sting from back
		
		//     012345
		str = "python";
		System.out.println(str.indexOf("h")); //3
		
		System.out.println("=====================");
		
		String str1 = "sdfssdgfasdasdf43fsdfsdf45fdd{Aloha, Friends!}sdfssdsfsdfretdfddfsdf";
		// Get the text that between {text}
		
		int indexBeg = str1.indexOf("{");
		int indexEnd = str1.indexOf("}");
		
		String result = str1.substring(indexBeg + 1, indexEnd);
		System.out.println(result);	
	}
}
