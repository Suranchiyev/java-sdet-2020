package day27;

public class Cat {
	private String name;
	private int age;
	private String secondName;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		// System.out.println("Constructor with argruments");
	}
	
    public Cat() {
    	// System.out.println("Empty constructor");
    }
    
    public String getSecondName() {
    	return secondName;
    }
    
    public void setSecondName(String secondName) {
    	this.secondName = secondName;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }   
}
