package day50;
import java.util.ArrayList;
import java.util.List;

// POJO
public class Person extends Object{
	private String name;
	private int age;
	private List<String> kids;
	
	
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
	
	public List<String> getKids() {
		return new ArrayList<>(kids);
	}
	
	public void setKids(List<String> kids) {
		this.kids = new ArrayList<>(kids);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((kids == null) ? 0 : kids.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (kids == null) {
			if (other.kids != null)
				return false;
		} else if (!kids.equals(other.kids))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", kids=" + kids + "]";
//	}
	
	
}
