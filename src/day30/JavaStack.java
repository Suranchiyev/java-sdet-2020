package day30;

import java.util.Stack;

public class JavaStack {
	// Deque can behave as FIFO and LIFO
	
	// Stack - LIFO data structure
	
	public static void main(String[] args) {
		Stack<String> messages = new Stack();
		// push() will add element on 'top' of the Stack
		messages.push("Message from: John");
		messages.push("Message from: Alex");
		messages.push("Message from: Smith");
		
		// pop() will get element from the top(last added) of the Stack
		// it will remove this element
		String message = messages.pop();
		System.out.println(message);
		System.out.println(messages);
		
		message = messages.pop();
		System.out.println(message);
		System.out.println(messages);
		
		message = messages.pop();
		System.out.println(message);
		System.out.println(messages);
	}
}
