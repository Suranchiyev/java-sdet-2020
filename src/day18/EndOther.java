package day18;

public class EndOther {
    public static void main(String[] args) {
    	//                      01234    012
        boolean res = endOther("Hiabc", "abc");
        System.out.println(res);
    }

    // endOther('abc', 'abXabc')
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int aLength = a.length();
        int bLength = b.length();
        
        if(aLength > bLength) {
        	return a.substring(aLength - bLength).equals(b);
        }else {
        	return b.substring(bLength - aLength).equals(a);
        }
        
    }
}
