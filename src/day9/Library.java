package day9;

public class Library {
	public static void main(String[] args) {
		// Create 2 objects from Book class
		// Assign all values (any value)
		// Print all the details for both objects
		
		Book oca = new Book();
		oca.id = 1;
		oca.title = "OCA";
		oca.author = "Jeanne Boyarsky";
		oca.pages = 373;
		oca.printDetails();
		//showDetails(oca);
		
		Book ocp = new Book();
		ocp.id = 2;
		ocp.title = "OCP";
		ocp.author = "Scott Selikoff";
		ocp.pages = 664;
		ocp.printDetails();
		//showDetails(ocp);
		
		oca.read(); // Reading.. OCA
		ocp.read(); // Reading.. OCP
		
		oca.title = "Oracle Certified Professional";
		oca.read();
	}
	
	public static void showDetails(Book book) {
		System.out.println("Book ID: " + book.id);
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println(book.pages);
		System.out.println("------------");
	}
}
