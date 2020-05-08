package day18;

public class CatDog {
	public static void main(String[] args) {
		
		boolean res = catDog("catdocat");
		System.out.println(res);
	}

	public static boolean catDog(String str) {
		// count cat
		// count dog
		int catCount = 0;
		int dogCount = 0;
		
		for(int i = 0; i < str.length() - 2; i++) {
			//    f       && 
			if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
				catCount++;
			}
			
			if(str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
				dogCount++;
			}
		}
		
	    return catCount == dogCount;
	}
}
