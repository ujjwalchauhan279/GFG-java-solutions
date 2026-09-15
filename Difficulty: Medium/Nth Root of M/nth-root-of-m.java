class Solution {
    public int helper(int n, int i){
        int ans = 1;
        for(int j=1; j<=n; j++) ans *= i;
        
        return ans;
    }
    public int nthRoot(int n, int m) {
        if(m==0) return 0;
        for(int i=1; i<=m; i++){
            int x = helper(n, i);
            if(x == m) return i;
            if(x > m) break;
        }
        
        return -1;
    }
}