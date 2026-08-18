class Solution {
    public void helper(Node root, ArrayList<Integer> innerList, ArrayList<ArrayList<Integer>> list){
        if(root == null) return;
        
        ArrayList<Integer> newList = new ArrayList<>(innerList);
        newList.add(root.data);
        
        if(root.left == null && root.right == null){
            list.add(newList);
            return;
        }
        
        helper(root.left, newList, list);
        helper(root.right, newList, list);
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        helper(root, new ArrayList<>(), list);
        
        return list;
    }
}