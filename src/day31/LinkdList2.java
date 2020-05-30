package day31;

public class LinkdList2 {
	private Node head;
	
	public void add(int value) {
		if(head == null) {
			head = new Node(value);
			return;
		}
		
		Node headCopy = head;
		while(headCopy.next != null) {
			headCopy = headCopy.next;
		}
		
		headCopy.next = new Node(value);
	}
	
	public void remove(int value) {
		if(head.value == value) {
			head = head.next;
			return;
		}
		
		Node copyHead = head;
		Node previousNode = copyHead;
		while(copyHead != null) {
			if(copyHead.value == value) {
				previousNode.next = copyHead.next;
				return;
			}
			
			previousNode = copyHead;
			copyHead = copyHead.next;
		}
	}
	
	public String toString() {
		Node headCopy = head;
		String str = "[";
		do {
			str += headCopy.value + ", ";
			headCopy = headCopy.next;
		}while(headCopy != null);
		
		return str.substring(0, str.length() - 2) + "]";
	}
}
