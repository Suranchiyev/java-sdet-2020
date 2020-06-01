package day32;

public class MethodsDemo {
	
	public static void main(String[] args) {
		CustomMethods obj = new CustomMethods();
		obj.wordToPrint = "Java";
		
		obj.print10();
	
		obj.print10("Orange");
		
		String res = obj.copy3("Aaa");
		System.out.println(res);
		
		int[] arr = {1, 2, 3, 4, 88, 7};
		obj.getMax(arr);
		
		
		
		String str = "hello";
		str = str.toUpperCase();
		
		String str1 = new String("APPLE");
		str1 = str1.toLowerCase();
		
		// ========================
		
		int i = Integer.parseInt("234");
		
		String num = String.valueOf(342);
		
		CustomMethods.sayHelloToWorld();
	}
	
}
