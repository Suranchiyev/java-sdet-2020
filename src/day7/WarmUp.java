package day7;

public class WarmUp {
	public static void main(String[] args) {
		String name = "Bob";
		String city = "Aldie";

		printDetails(name, city);

		printDetails("John", "Arlington");

		String res = getForamattedDetails(26, "Smith");
		System.out.println(res);

		// create a method that will take two String arguments 
		// method will print the argument in this format
		// <name> is from <city>


		// create a method that will take one int agrument age and one String argument name
		// method will return it's arguments as String in this format
		// Name = <name>, Age = <age>
	}

	public static void printDetails(String name, String city) {
		System.out.println(name + " is from " + city);
	}

	public static String getForamattedDetails(int age, String name) {
		String formattedStr = "Name = " + name + ", Age = " + age;
		return formattedStr;
	}
}

	
