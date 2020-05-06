package day17;

public class Cities {
	public static void main(String[] args) {
		// create empty StringBuilder
		StringBuilder tokyo = new StringBuilder();
		// add the value
		tokyo.append("Tokyo");
		System.out.println(tokyo);
		
		tokyo.append(" - population is 37,400,068");
		System.out.println(tokyo);
		
		// create StringBuilder with initial value
		StringBuilder shanghai = new StringBuilder("Shanghai");
		System.out.println(shanghai);
		shanghai.append(" - population is 25,582,000");
		System.out.println(shanghai);
		
		// Why do we need to use StringBuilder when we have String?
		// Efficiency - for StringBuilder we can reuse same object, and
		// for String we would need to create new objects all the time when
		// we want to change it's value because String class is immutable
		// and StringBuilder is mutable.
		
		String mexicoCity = "Mexico City"; // 1
		mexicoCity = mexicoCity + " - population is 21,581,00"; // 2
		System.out.println(mexicoCity);
		// What do you think, how many String object got created by above example?
		// total is 3 objects
		
		String alphabet = "";
		for(char current = 'a'; current <= 'z'; current++) {
			alphabet = alphabet + current;
		}
		System.out.println(alphabet);
		// 27 String Object got created
		
		StringBuilder alphabetSb = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++) {
			alphabetSb.append(current);
		}
		System.out.println("StringBuilder: " + alphabetSb);
		// Only one object of StringBuilder got created		
	}
}
