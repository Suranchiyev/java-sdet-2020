package day23;

public class SwitchSt {
	enum City {Aldie, Chantilly, Arlington, DC};
	
	public static void main(String[] args) {
		City city = City.Aldie;
		switch(city) {
		case Aldie:
			System.out.println("Welcome to Aldie");
		    break;
		case Chantilly:
			System.out.println("Welcome to Chantilly");
		    break;
		case Arlington:
			System.out.println("Welcome to Arlington");
			break;
		case DC:
			System.out.println("Welcome to DC");
			break;
		}
		
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Doesn't support");
			break;
		}
		
//		if(num == 1) {
//			System.out.println("One");
//		}else if(num == 2) {
//			System.out.println("Two");
//		}else if(num == 3) {
//			System.out.println("Three");
//		}else if(num == 4) {
//			System.out.println("Four");
//		}else {
//			System.out.println("Does not support");
//		}
	}
}
