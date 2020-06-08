package day36;

import java.util.ArrayList;
import java.util.List;

public class MethodsDemo {
	public static void main(String[] args) {
		Methods obj = new Methods();

		int numChars = obj.countChars("a b c");
		System.out.println(numChars);
		
		System.out.println(obj.firstAndLast("apple"));
		
		System.out.println(obj.mCopyWords("hello", 2));
		
		int[] nums = {4, 2, 8, 9};
		System.out.println(obj.sumArr(nums));
		
		List<Integer> l = getList();	
		int sum = obj.sumList(l);	
		System.out.println(sum);
		
		List<List<Integer>> twoDimList = new ArrayList<>();		
		twoDimList.add(getList());
		twoDimList.add(getList());
		twoDimList.add(getList());
		twoDimList.add(getList());
		
		System.out.println(obj.sumList2(twoDimList));
	}
	
	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
}
