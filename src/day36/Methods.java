package day36;

import java.util.List;

public class Methods {
	
//	   Create method that will accept one String as argument
//	   and return the number of characters (white space does not count)
	
//	   "hello John" -> 9
//	   "a b c"      -> 3
	
	public int countChars(String str) {
		str = str.replace(" ", "");
		return str.length();
	}
	
//	2. Create method that will accept one String as argument. Method will return  first and last character of argument as String
//	"apple" -> "ae"
//  "John"  -> "Jn"
    public String firstAndLast(String str) {
    	if(str.length() > 1) {
        	return str.charAt(0) +""+ str.charAt(str.length() - 1);
    	}
    	return str;
    }
    
    
//	3. Create method that will accept one String and one int arguments
//	   Method will return String argument number of int argument times.
//
//	   method("hello", 2) -> "hellohello"
//	   method("A", 3) -> "AAA"
//	   method("B", 0) -> ""
    
	public String mCopyWords(String str, int number) {
		String res = "";		
		for(int i = 0; i < number; i++) {
			res += str;
		}		
		return res;
	}
	
	
//    Create a method that will accept int[]
//    Method should return sum of each element from array
//
//    method([4, 2, 8, 9]) -> 23
//    method([1, 1, 1])    -> 3	
	
	public int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}
	
	
//  Create a method that will accept List<Integer> 
//  Method should return sum of each element from list
	// size()
	// get(index)
	
	public int sumList(List<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	// [[1, 2], [2, 4], [5, 3, 3]] -> 20
	public int sumList2(List<List<Integer>> twoDimList) {
		int sum = 0;
		
		for(int i = 0; i < twoDimList.size(); i++) {
			//List<Integer> list = twoDimList.get(i);
			
			for(int j = 0; j < twoDimList.get(i).size(); j++) {
				        //List<Integer>,get(j)
				sum += twoDimList.get(i).get(j);
			}
			
		}
		
		return sum;
	}
}
