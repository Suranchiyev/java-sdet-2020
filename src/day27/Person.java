package day27;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;
		if(person.getName().equals(this.name)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}


