package day24;

public class XyzMiddle {
    public static void main(String[] args) {
        boolean res = xyzMiddle("AAAxyzBB");
        System.out.println(res);
    }

    
    /*
     * Use:
      xyzMiddle("AxyzBB")
      return:
      true

       Use:
      xyzMiddle("AxyzBBB")
      return:
      false
     */
    
    //xyzAxyzBBB
    public static boolean xyzMiddle(String str) {
    	if(!str.contains("xyz")) {
    		return false;
    	}
    	
    	int middle = str.length() / 2;
    	if(str.length() % 2 == 0) {
    		return str.substring(middle - 2, middle + 1).equals("xyz") || str.substring(middle - 1, middle + 2).equals("xyz");
    	
    	}else {
    		return str.substring(middle - 1, middle + 2).equals("xyz");
    	
    	}
    	
    	
//    	int indexXyz = str.indexOf("xyz");
//    	System.out.println(indexXyz);
//    	
//    	int firstPartLen = str.substring(0, indexXyz).length();   // 9
//    	int secondPartLen = str.substring(indexXyz + 3).length(); // 10 
//    	
//    	int diff = Math.abs(firstPartLen - secondPartLen);
//        
//    	return diff <= 1;
    }
}
