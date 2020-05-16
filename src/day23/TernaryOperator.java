package day23;

public class TernaryOperator {
	public static void main(String[] args) {
		//                      true          false
		// booleanCondition ? expression : expression;
		
		int grade = 190;
		
		String name = grade > 100? "John" : "Smith";
		System.out.println(name);
		
//		if(grade > 100) {
//			name = "John";
//		} else {
//			name = "Smith";
//		}
		
		
		// bool ? exp : (bool ? exp : exp)
		
		int num = 7 > 8 ? 100 : ( 9 > 8 ? 150 : 200);
		
		System.out.println(num);
		
		System.out.println(8 > 9 ? "Hello" : 12345);
	}
}
