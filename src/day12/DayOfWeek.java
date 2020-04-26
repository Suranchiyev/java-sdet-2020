package day12;

public class DayOfWeek {
	public static void main(String[] args) {
		/*
		 * 0 - Sun 1 - Mon 2 - Tue 3 - Wed 4 - Thur 5 - Fri 6 - Sat
		 */

		int dayOfWeek = 0;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sun");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
		
	}
}
