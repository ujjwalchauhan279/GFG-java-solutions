class Solution {
    public int rangeBitwiseOr(int l, int r) {
        // code here
        int OR = 0;
        for(int i=l; i<=r; i++){
            OR |= i;
        }
        
        return OR;
    }
}