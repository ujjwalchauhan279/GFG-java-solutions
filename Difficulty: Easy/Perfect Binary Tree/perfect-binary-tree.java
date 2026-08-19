/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    int level(Node root){
        if(root == null) return 0;
        
        return 1 + Math.max(level(root.left), level(root.right));
    }
    int size(Node root){
        if(root == null) return 0;
        
        return 1 + size(root.left) + size(root.right);
    }
    boolean isPerfect(Node root) {
        int l = level(root);
        int s = size(root);
        
        if((Math.pow(2, l) - 1) == s) return true;
        return false;
    }
};