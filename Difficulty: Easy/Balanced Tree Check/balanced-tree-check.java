/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public int level(Node root){
        if(root == null) return 0;

        return 1 + Math.max(level(root.left), level(root.right));
    }
    public boolean isBalanced(Node root) {
        if(root == null) return true;

        if(Math.abs(level(root.left) - level(root.right)) > 1) return false; 

        return isBalanced(root.left) && isBalanced(root.right);
    }
}