package day26;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		if(name.length() == 0 || name == null) {
			System.out.println("Error: Invalid name");
		}else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age < 1) {
			// throw exception here
			System.out.println("Error: Invalid age input");
		}else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
}
