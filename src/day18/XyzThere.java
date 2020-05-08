package day18;

public class XyzThere {
    public static void main(String[] args) {
        boolean res = xyzThere("xyz.abc");
        System.out.println(res);
    }

    public static boolean xyzThere(String str) {
    	for(int i = 0; i < str.length() - 2; i++) {
    		char one = str.charAt(i);
    		char two = str.charAt(i + 1);
    		char three = str.charAt(i + 2);
    		
    		if(one == 'x' && two == 'y' && three == 'z') {
    			if(i == 0) {
    				return true;
    			}
    			  
    	 		if(str.charAt(i - 1) != '.') {
        		    return true;	
        		}
    		}	
    	}
    	
    	return false;
    }
}
