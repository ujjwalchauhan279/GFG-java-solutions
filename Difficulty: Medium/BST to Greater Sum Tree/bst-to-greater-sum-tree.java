/* Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sum;
    public void inorder(Node root){
        if(root == null) return;
        
        inorder(root.right);
        
        sum += root.data;
        root.data = sum - root.data;
        
        inorder(root.left);
    }
    public void transformTree(Node root) {
        sum = 0;
        
        inorder(root);
    }
}