/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int s;
    public boolean isHeap(Node root) {
        // code here
        s = size(root);
        return isMaxHeap(root) && isCBT(root, 1);
    }
    public int size(Node root){
        if(root == null) return 0;
        
        return 1 + size(root.left) + size(root.right);
    }
    public boolean isCBT(Node root, int idx){
        if(root == null) return true;
        
        if(s < idx) return false;
        return isCBT(root.left, 2*idx) && isCBT(root.right, 2*idx + 1);
    }
    public boolean isMaxHeap(Node root){
        if(root == null) return true;
        int leftVal = (root.left != null)? root.left.data: Integer.MIN_VALUE;
        int rightVal = (root.right != null)? root.right.data: Integer.MIN_VALUE;
        
        if(leftVal >= root.data || rightVal >= root.data) return false;
        
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}