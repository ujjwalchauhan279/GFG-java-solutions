/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
} */

class Solution {
	public static int findMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		// code here
		return (int)Math.max(root.data, (int)(Math.max(findMax(root.left), findMax(root.right))));
	}
	
	public static int findMin(Node root) {
		if (root == null)
			return Integer.MAX_VALUE;
		// code here
		return (int)Math.min(root.data, (int)(Math.min(findMin(root.left), findMin(root.right))));
	}
}
