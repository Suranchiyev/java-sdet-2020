package day4;

public class Book {
	private static String title = "Java OCA";
	private static int numberOfPages = 400;
	private static double price = 29.99;

	public static void main(String[] args) {

		System.out.println("Title: " + title);
		System.out.println("Pages: " + numberOfPages);
		System.out.println("Price: " + price);

		title = "Clean Code";
		numberOfPages = 350;
		price = 49.99;
	}
}
