package day23;

public class LoopsReview2 {
	public static void main(String[] args) {
		// for loop
		// we use for loop when we know exact iterations
		
		// for(declarationPart; conditionPart; UpdatePart) {
		// 	  
		// }
		
		//       0   ; 5 < 5
		for(int i = 0; i < 5; i++) {
			//                  HELLO: 4
			System.out.println("HELLO: " + i);
		}
		
		// 1...1000
		for(int i = 1; i <= 1000; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 1000...1
		//      1000  ; 1000 >= 1; i--
		for(int i = 1000; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		// 1 ... 1000 every 5 numbers
		for(int i = 0; i <= 1000; i += 5) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		String str = "hello, Im John Doe";
		// letter 'o' 
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o') {
				continue;
			}
			
			System.out.println(str.charAt(i));
		}
		
		
		String[] names = {"Smith", "John", "Alex", "Kuba"};
		// ["Smith"]["John"]...
		
		for(String word : names) {
			System.out.println(word.toUpperCase());
		}
		
	}
}
