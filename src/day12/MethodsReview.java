package day12;

public class MethodsReview {
	public static void main(String[] args) {
		System.out.println(getStr());
		
		//    hello
		String str = getStr();
		System.out.println(str);
		
		// int num = getStr();
		
		//int age = 15;
		String ageGroup = getAgeGroup(150);
		System.out.println(ageGroup);
		
		displayNumber(6);
		displayNumber(9.9);
		
		System.out.println(concat("hello", "World"));
		System.out.println(concat("java", "is", "cool"));
		
		//             012345
		String str1 = "orange";
		//str1 = str1.substring(1);
		str1 = str1.substring(0, 2);
	}
	
	public static String getStr() {
		if(9 > 4) {
			return "hello";
		}else {
			return "apple";
		}
	}
	
	public static String getAgeGroup(int age) {
		if(age >= 1 && age <= 12) {
			return "kid";
		}else if(age >= 13 && age <= 18) {
			return "teen";
		}else if(age >= 19 && age <= 60) {
			return "adult";
		}else if(age >= 61 && age <= 120){
			return "senior";
		}

		return "Invalid age";
	}
	
	public static void displayNumber(int number) {
		System.out.println("Number: " + number);
	}
	
	public static void displayNumber(double number) {
		System.out.println("Number: " + number);
	}
	
	public static String concat(String strOne, String strTwo) {
		return strOne + strTwo;
	}
	
	public static String concat(String strOne, String strTwo, String strThree) {
		return strOne + strTwo + strThree;
	}
}
