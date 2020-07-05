package day51;

public class ReadInventoryThread implements Runnable {
	
	@Override
	public void run() {
		for(int i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {		
		// 1. extends Thread class
		// 2. implement Runnable interface 
		// 3. By using ServerWorkers interface API (task) 	
		
		Thread thread1 = new Thread(new ReadInventoryThread());
		Thread thread2 = new Thread(new ReadInventoryThread());
		
		thread1.start();
		thread2.start();
		
//		1
//		1
//		2
//		3
//		4
//		2
//		3
//		4

	}
}
