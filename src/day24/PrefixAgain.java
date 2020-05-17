package day24;

public class PrefixAgain {
    public static void main(String[] args) {
        boolean res = prefixAgain("abXYabc", 1);
        System.out.println(res);
    }

    public static boolean prefixAgain(String str, int n) {
        // 1. get prefix !
        // 2. get rest of the string
        // 3. if rest of the string contains prefix
    	
    	String prefix = str.substring(0, n);
    	String rest = str.substring(n);
    	
    	return rest.contains(prefix);
    }
}
