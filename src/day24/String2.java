package day24;

public class String2 {
	private String str;
	
	public String2(String strInput) {
		str = strInput;
	}
	
	public String2 reverse() {
		String res = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		
		return new String2(res);
	}
	
	public int length() {
		return str.length();
	}
	
	public char charAt(int index) {
		return str.charAt(index);
	}
	
	public int indexOf(String ch) {
		return str.indexOf(ch);
	}
	
	public int indexOf(char ch) {
		return str.indexOf(ch);
	}
	
	//...
	
	
	public String toString() {
		return str;
	}
}
