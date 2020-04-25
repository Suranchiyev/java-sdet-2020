package day6;

public class MethodExample3 {

	public static void main(String[] args) {
		sayHello(); // Hello World!

		String res = getHello();
		System.out.println(res); // Hello From getHello

		String apple = getApple();
		System.out.println(apple);

//                      123
		int numRes = getNumber();
		System.out.println(numRes);
	
        //                     123
		System.out.println(getNumber());

		run();
	}

	public static void sayHello() {
		System.out.println("Hello World!");
	}

	public static String getHello() {
		//String word = "Hello World from return method";
		return "Hello From getHello";
	}

	public static String getApple() {
		String str = "apple";
		System.out.println(str);
		return str;
	}

	public static int getNumber() {
		// some code
		int num = 123;
		return num;
	}

	public static void run() {
		// if your method is void you cannot return a value
		//return "running";

		System.out.println("I'm running now..");

		//return; // it will exit from the method
		// System.out.println("Something ....");
	}
	
}
