/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size() != 0){
            Node front = q.remove();
            list.add(front.data);
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        
        return list;
    }
}