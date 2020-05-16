package day23;

public class MethodsReview {
	public static void main(String[] args) {
		// public - access modifier (accessible everywhere)
		// static - method belongs to class
		// void   - it means method does not return value
		// main   - name of the method
		// String[] args - argument of main method => accepts String[] as argument
		
        
        
        String str = get5("John");
        System.out.println(str);
        
        String str1 = get5("Smith");
        System.out.println(str1);
        
        
        boolean b = isMore100(200);
        System.out.println(b);
        
        print5("50hfgh");
        print5(50);
        
        // Break 10 min till 11:15 AM
	}
	
	public static void print5(int number) {
		for(int i = 0; i < 5; i++) {
			System.out.println(number);
		}
	}
	
	public static void print5(String str) {
		for(int i = 0; i < 5; i++) {
			System.out.println(str);
		}
	}
	
	public static String get5(String str) {
		String result = "";
		for(int i = 0; i < 5; i++) {
			result += str;
		}
		return result;
	}
	
	public static boolean isMore100(int number) {
		if(number > 100) {
			return true;
		} else if(number < 100) {
			return false;
		}
		
		return false;
	}
	
	
}
