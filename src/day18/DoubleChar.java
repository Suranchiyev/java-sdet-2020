package day18;

public class DoubleChar {
	public static void main(String[] args) {
		String res = doubleChar("The");
		System.out.println(res);
	}

	// doubleChar("The") -> "TThhee"
	public static String doubleChar(String str) {
		// empty string
		// loop to go throw each char in the str
		// keep adding to empty string in the loop each char two times
		
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			//  =  "" +    'T'     +             'T'
			res = res + str.charAt(i) + str.charAt(i);
		}
		
		return res;
	}
}
