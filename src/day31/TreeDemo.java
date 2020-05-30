package day31;

public class TreeDemo {
	public static void main(String[] args) {
//		TreeNode root = new TreeNode(8);
//		
//		TreeNode node = new TreeNode(50);
//		
//		if(root.value >= node.value) {
//			root.leftChild = node;
//		}else {
//			root.rightChild = node;
//		}
		
		Tree treeNums = new Tree();
		treeNums.add(8);
		treeNums.add(4);
		treeNums.add(50);
		treeNums.add(2);
		treeNums.add(7);
		treeNums.add(30);
		treeNums.add(189);
		treeNums.add(1);
		treeNums.add(25);
		treeNums.add(49);
		treeNums.add(456);
		
		treeNums.display();
		
		
	}
}
