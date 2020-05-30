package day31;

public class LinkedListDemo {
	public static void main(String[] args) {
		Node headNode = new Node(1);
		
		// Node node2 = new Node(2);
		
		headNode.next = new Node(2);
		
		//System.out.println(headNode.next.next);
		headNode.next.next = new Node(3);
		printList(headNode);
		
		Node copyOfHead = headNode;
		while(copyOfHead.next != null) {
			copyOfHead = copyOfHead.next;
		}
		
		copyOfHead.next = new Node(4);
		printList(headNode);
		
		// add new node in the beginning of the list
		Node node5 = new Node(5);
		node5.next = headNode;
		
		headNode = node5;
		headNode = remove(headNode, 2);
		
		printList(headNode);
	}
	
	public static Node remove(Node head, int value) {
		if(head.value == value) {
			head = head.next;
			return head;
		}
		
		Node copyHead = head;
		Node previousNode = copyHead;
		while(copyHead != null) {
			if(copyHead.value == value) {
				previousNode.next = copyHead.next;
				return head;
			}
			
			previousNode = copyHead;
			copyHead = copyHead.next;
		}
		
		return head;
	}
	
	public static void printList(Node head) {
		if(head == null) {
			return;
		}
		
		do {
			System.out.print(head.value + " ");
			head = head.next;
		}while(head != null);
		System.out.println();
		
	}
}
