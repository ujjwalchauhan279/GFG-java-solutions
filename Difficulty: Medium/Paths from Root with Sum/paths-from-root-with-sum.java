class Solution {
    public void helper(Node root, int sum,  ArrayList<Integer> innerList, ArrayList<ArrayList<Integer>> list){
        if(root == null) return;
        innerList.add(root.data);
        
        if(sum == root.data){
            list.add(new ArrayList<>(innerList));
        }
        
        helper(root.left, sum-root.data, innerList, list);
        helper(root.right, sum-root.data, innerList, list);
        innerList.remove(innerList.size()-1);
    }
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();
        
        helper(root, sum, innerList, list);
        
        return list;
    }
}