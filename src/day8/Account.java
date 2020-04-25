package day8;

public class Account {
	public static void main(String[] args) {
		int savings = 50000;
		int salary = 100000;
		int expenses = 70000;
		
		//         50000 , 100000, 70000
		myFinance(savings, salary, expenses);
		
		// Create a method:
		// if salary more then expenses or savings more then expenses
		// then print "Good! Still Alive!"
		// Otherwise print "Bankrupt"
				
		savings = 90000;
		salary = 80000;
		expenses = 100000;
		//        90000,  80000,   100000
		myFinance(savings, salary, expenses);
		
	}
	
	public static void myFinance(int savings, int salary, int expenses) {
		if(salary > expenses || savings > expenses) {
			System.out.println("Good! Still Alive!");
		} else {
			System.out.println("Bankrupt");
		}
	}
}
