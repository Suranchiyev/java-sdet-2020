package day18;

public class CountCode {
    public static void main(String[] args) {
        int res = countCode("aaacodebbb");
        //System.out.println(res);
        
        System.out.println(countLetter("abcdasda"));
    }

    // countCode("cozexxcope") -> 2
    // code
    // 
    public static int countCode(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 3; i++) {
        	char letterOne = str.charAt(i);
        	char letterTwo = str.charAt(i + 1);
        	char letterFour = str.charAt(i + 3);
        	
        	if(letterOne == 'c' && letterTwo == 'o' && letterFour == 'e') {
        		count++;
        	}
        }
        
    	return count;
    }
    
    //  01234..
    // "abcdasda"
    public static int countLetter(String str) {
    	int count = 0;
    	
        for(int i = 0; i < str.length(); i++) {
        	
        	System.out.println(str.charAt(i));
        	
        	if(str.charAt(i) == 'a') {
        		count++;
        	}
        }
        
        return count;
    }
    
    
}
