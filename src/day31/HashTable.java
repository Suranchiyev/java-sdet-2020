package day31;

public class HashTable {
	private static final int HASH_MAX = 10;
	private Node2[] hashTable = new Node2[HASH_MAX];
	
	public void add(String value) {
		int index = hash(value);
		if(hashTable[index] == null) {
			hashTable[index] = new Node2(value);
		}else {
			Node2 head = hashTable[index];
			addNode(head, value);
		}
	}
	
	public void addNode(Node2 head, String value) {
		if(head == null) {
			head = new Node2(value);
			return;
		}
		
		Node2 headCopy = head;
		while(headCopy.next != null) {
			headCopy = headCopy.next;
		}
		
		headCopy.next = new Node2(value);
	}
	
	public int hash(String str) {
		int code = 0;
		
		for(int i = 0; i < str.length(); i++) {
			code += str.charAt(i);
		}
		
		return code % HASH_MAX;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(Node2 head : hashTable) {
			if(head != null) {
				sb.append(nodeToString(head) + ", ");
			}
		}
		
		return sb.substring(0, sb.length() - 2) + "]";
	}
	
	private String nodeToString(Node2 head) {
		Node2 headCopy = head;
		StringBuilder sb = new StringBuilder();
		do {
			sb.append(headCopy.value + ", ");
			headCopy = headCopy.next;
		}while(headCopy != null);
		
		return sb.substring(0, sb.length() - 2);
	}
}
