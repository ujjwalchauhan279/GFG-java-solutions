class Solution {
    public static Node helper(int inorder[], int preorder[], int prelow, int prehigh, int inlow, int inhigh){
        if(inlow > inhigh) return null;
        int data = preorder[prelow];
        Node root = new Node(data);
        
        int r = -1;
        for(int i=inlow; i<=inhigh; i++){
            if(inorder[i] == data){
                r = i;
                break;
            }
        }
        
        int x = r - inlow;
        
        root.left = helper(inorder, preorder, prelow+1, prelow+x, inlow, r-1);
        root.right = helper(inorder, preorder, prelow+x+1, prehigh, r+1, inhigh);
        
        return root;
    }
    
    public static Node buildTree(int inorder[], int preorder[]) {
        int n = inorder.length;
        return helper(inorder, preorder, 0, n-1, 0, n-1);
    }
}