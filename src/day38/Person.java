package day38;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if(name == null) {
			throw new RuntimeException("Invalid input for Person name");
		}
		
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age)  {
		if(age < 1) {
			throw new RuntimeException("Invalid age");
		}
		
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
