package day7;

public class Expample {
	public static void main(String[] args) {

		boolean b = false;
		boolean b1 = true;

//            false || true 
		if( b && b1 || true ) {
			System.out.println("Yes, true. Im here");
		} else {
			System.out.println("No, False.");
		}

//                          f        &&   t   &&  t
//                     f   ||   f    &&   t  &&   t
		boolean b3 = 5 > 8 || 9 > 10 && true && 1 < 4;
		System.out.println(b3); // false

        //            t         f
		boolean b4 = 7 > 6 || 5 > 6;
		System.out.println(b4); // true
	}
}