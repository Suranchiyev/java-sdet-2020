package day30;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue in Java represents a data structure designed to have elements at
		// end of the queue and elements removed from the beginning
		// FIFO - First In, First Out
		
		// Queue has two implementations 
		// 1. LinkedList
		// 2. PriorityQueue
		
		// What's the Queue?
		// It's FIFO - First In, First Out data structure
		
		Queue<String> queueInDunkin2 = new PriorityQueue();
		queueInDunkin2.add("Smith");
		queueInDunkin2.poll();
		
		// [""][""][""][""][""]
		Queue<String> queueInDunkin = new LinkedList<>();
		queueInDunkin.add("Alex");
		queueInDunkin.add("Misha");
		queueInDunkin.add("Boris");
		queueInDunkin.add("John"); // when Queue is full add() will fail and throw exception
		
		queueInDunkin.offer("Ari"); // when Queue is full offer() will fail and return false
		queueInDunkin.offer("Meerim");
		
		System.out.println(queueInDunkin);
		
		// poll() method will return first element from the queue
		System.out.println("-----------");
		String customer = queueInDunkin.poll();
		System.out.println("Completed order: " + customer);
		System.out.println("-----------");
		
		System.out.println("Customers in line: " + queueInDunkin);
		
		System.out.println("-----------");
		customer = queueInDunkin.poll();
		System.out.println("Completed order: " + customer);
		System.out.println("-----------");
		System.out.println("Customers in line: " + queueInDunkin);
	}
}
