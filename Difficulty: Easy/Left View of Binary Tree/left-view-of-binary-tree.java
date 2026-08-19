/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public void mirror(Node root){
        if(root == null) return;
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        mirror(root.left);
        mirror(root.right);
    }
    
    public void helper(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if(level >= list.size()) list.add(root.data);
        else list.set(level, root.data);
        
        helper(root.left, list, level+1);
        helper(root.right, list, level+1);
    }
    
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        
        mirror(root);
        
        helper(root, list, 0);
        
        return list;
    }
}