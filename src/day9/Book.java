package day9;

public class Book {
	public long id;
	public String title;
	public String author;
	public int pages;
	
	public void read() {
		System.out.println("Reading.. " + title);
	}
	
	public void printDetails() {
		System.out.println("Book ID: " + id);
		System.out.println(title);
		System.out.println(author);
		System.out.println(pages);
		System.out.println("------------");
	}
}
