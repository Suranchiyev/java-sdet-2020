package day38;


public class CheckedException {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			wait(1);
			
			
			//waitMin(2);
		}
	}
	
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
			System.out.println("Exception is here, do something..");
		}
	}
	
	public static void waitMin(int min) throws InterruptedException {
		Thread.sleep(min * 60 * 1000);
	}
}
