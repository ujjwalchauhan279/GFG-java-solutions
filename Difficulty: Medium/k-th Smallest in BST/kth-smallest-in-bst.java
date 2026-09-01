/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static int i;
    static int ans;
    public void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        i--;
        if(i == 0) ans = root.data;
        inorder(root.right);
    }
    public int kthSmallest(Node root, int k) {
        i = k;
        ans = -1;
        
        inorder(root);
        
        return ans;
    }
}