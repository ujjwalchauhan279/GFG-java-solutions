class Solution {
    public int reverseBits(int n) {
        // code here
        int ans = 0;
        while(n != 0){
            ans = ans << 1;
            ans = ans | (n & 1);
            n = n >> 1;
        }
        
        return ans;
    }
}