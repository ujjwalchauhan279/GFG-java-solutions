class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        if(root.left == null && root.right == null) return list;
        
        leftTraversal(root.left, list);
        bottomTraversal(root, list);
        rightTraversal(root.right, list);
        
        return list;
    }
    
    public void leftTraversal(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        list.add(root.data);
        if(root.left != null) leftTraversal(root.left, list);
        else leftTraversal(root.right, list);
    }
    
    public void bottomTraversal(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) list.add(root.data);
        
        bottomTraversal(root.left, list);
        bottomTraversal(root.right, list);
    }
    
    public void rightTraversal(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        if(root.right != null) rightTraversal(root.right, list);
        else rightTraversal(root.left, list);
        list.add(root.data);
    }
}