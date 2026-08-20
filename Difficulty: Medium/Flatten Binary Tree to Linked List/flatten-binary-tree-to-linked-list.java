/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public static void preOrder(Node root, ArrayList<Node> list){
        if(root == null) return;

        list.add(root);
        preOrder(root.left, list); 
        preOrder(root.right, list);
    }
    public static void flatten(Node root) {
        // code here
        if(root == null) return;
        ArrayList<Node> list = new ArrayList<>();

        preOrder(root, list);
        list.get(0).left = null;

        for(int i=1; i<list.size(); i++){
            list.get(i-1).right = list.get(i);
            list.get(i).left = null;
        }

        list.get(list.size()-1).right = null;
    }
}