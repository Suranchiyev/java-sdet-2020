package day22;

public class LinearSearch {
	public static void main(String[] args) {
		
		String[] strNum = {"One", "Two", "Three", "Four", "Five"};
		System.out.println(search("Three", strNum));
		
	}
	
	public static int search(String key, String[] strArr) {
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals(key)) {
				return i;
			}
		}
		
		return -1;
	}
}
