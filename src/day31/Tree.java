package day31;

public class Tree {
	private TreeNode root;
	
	public void add(int value) {
		TreeNode newNode = new TreeNode(value);
		
		if(root == null) {
			root = newNode;
		}else {
			TreeNode focusNode = root;
			TreeNode parent;
			
			while(true) {
				parent = focusNode;
				if(value < focusNode.value) {
					focusNode = focusNode.leftChild;
					
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
					
				}else {
					focusNode = focusNode.rightChild;
					
					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	private void displayInner(TreeNode focusNode) {
		if(focusNode != null) {
			displayInner(focusNode.leftChild);
			
			System.out.println(focusNode.value);
			
			displayInner(focusNode.rightChild);
		}
	}
	
	public void display() {
		displayInner(root);
	}
}
