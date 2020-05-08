package day18;

public class CountHi {
    public static void main(String[] args) {
        int res = countHi("ABChi hi");
        System.out.println(res);
    }

    
    // countHi("ABChi hi") -> 2
    public static int countHi(String str) {
    	// create int variable to store return result
    	// loop to throw the string 
    	// get two letters each iteration if its "hi" increase int res var by 1
    	
    	int res = 0;
    	
    	for(int i = 0; i < str.length() - 1; i++) {
    		String subStr = str.substring(i, i + 2);
    		if(subStr.equals("hi")) {
    			res++;
    		}
    		
    		// String subStr = String.valueOf(str.charAt(i)) + str.charAt(i + 1);
//    		if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
//    			res++;
//    		}
    	}
    
    	return res;
    }
}
