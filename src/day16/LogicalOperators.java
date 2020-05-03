package day16;

public class LogicalOperators {
	public static void main(String[] args) {
		/**
		 *    && - logical and
 		 *    || - logical or
		 *    !  - logical NOT
		 */
		
	//	               f     ||        t   
		boolean a = (2 == 1) || (true && 4 >= 3);
		if(a) {
			System.out.println("a was true");
		}
		
		// false || true || false -> true
		// false && true && true  -> false
		
		//             t   &&  t
		//             !f
		boolean b = !false && true;
		System.out.println(b); //
		
		//                t               f -> f
		boolean c = (20 % 2 == 0) && !(5 / 2 <= 2);
		System.out.println(c);
		         
		
		boolean d = true && false || true && !false;
		System.out.println(d);
		
		boolean isJohn = false;
		
		String name = isJohn ? "John" : "Alex";
		
		System.out.println(name);
		System.out.println(isJohn ? "John" : 6);
		
		//             f                             t
		int result = 6 > 7 ? (10 == 10 ? 4 : 4) : (5 >= 5 ? 7 + 3 : 1) ;
		System.out.println(result);
		
		if(3 > 4) {
			System.out.println("hello John");
			System.out.println("hello class");
		} else {
			System.out.println("hello Alex");
		}
		
		char ch = 68;
		if(ch == 66) {
			System.out.println((char)66);
		}else if(ch == 67) {
			System.out.println((char)67);
		}else if(ch == 68) {
			System.out.println((char)68);
		}else {
			System.out.println(ch);
		}
	}
}
