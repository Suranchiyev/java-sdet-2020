package day24;

public class StarOut {
    public static void main(String[] args) {
        String res = starOut("sm**eil*ly"); // siy
        System.out.println(res);
    }

    public static String starOut(String str) {
        if(str.isEmpty() || str.length() == 1) {
            
    		return str.equals("*") ? "" : str;
    	}
        String withoutRight = "";
        
        for(int i = 0; i < str.length() - 1; i++) {
        	withoutRight += str.charAt(i);
        	
        	if(str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
        		i++;
        	}
        }
      
  
        withoutRight += str.charAt(str.length() - 2) != '*' ?  str.charAt(str.length() - 1) : "";

        String res = "";
        for(int i = 0; i < withoutRight.length() - 1; i++) {  	
        	if(withoutRight.charAt(i + 1) == '*' && withoutRight.charAt(i) != '*') {
        		continue;
        	}
        	res += withoutRight.charAt(i);
        }
        
        return (res + withoutRight.charAt(withoutRight.length() - 1)).replace("*", "");
    }
}
