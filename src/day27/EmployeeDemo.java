package day27;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setFirstname("John");
		emp1.setLastname("Doe");
		
		//emp1.age = -100;
		
		emp1.setAge(-100);
		
		System.out.println(emp1.getFirstname());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getFirstname());
	}
}
