package day27;

public class Employee {
	private String firstname;
	private String lastname;
	private int age;
	
//	public Employee(String fistname, String lastname, int age) {
//		this.firstname = fistname;
//	}
//	
//	public Employee() {
//		
//	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 1) {
			System.out.println("Wrong input");
			System.exit(0);
		}
		
		this.age = age;
	}
}
