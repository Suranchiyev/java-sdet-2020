package day18;

public class ExtraFront {
    public static void main(String[] args) {
        String res = extraFront("H");
        System.out.println(res);
    }
    
    /*
     * Use:
       extraFront("Hello")
       return:
       HeHeHe
     */

    public static String extraFront(String str) {
    	// loop that iterates 3 times 
    	// use substring to get first two char
    	// if string length is less 2 use whole string
    	
    	// Hello -> HeHeHe
    	String returnStr = "";
    		
    	for(int i = 0; i < 3; i++) {
    		//     5  < 2
    		if(str.length() < 2) {
    			returnStr = returnStr + str;
    		}else {
    			//HeHeHe  =  HeHe     + He
    			returnStr = returnStr + str.substring(0, 2);
    		}
    		// returnStr += str.length() < 2 ? str :  str.substring(0, 2);
    	}
    	
        return returnStr;
    }
}
