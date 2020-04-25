package day7;

public class ConditionalBranching1 {
	public static void main(String[] args) {
		// == equal to. We use this operator to compare primitives

		double d = 8.1;
		double d1 = 8.1;
//               true
		boolean isEqual = d == d1;

		if(isEqual) {
			System.out.println("Yes, they are equal");
		} else {
			System.out.println("No, they are not equal");
		}

//       != not equal to (1 != 5) => true, (1 != 1) => false
		if(d != d1) {
			System.out.println("Not Equal");
		} else {
			System.out.println("Equal");
		}
	}
}