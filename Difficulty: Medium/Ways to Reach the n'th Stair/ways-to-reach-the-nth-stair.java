class Solution {
    public int countWays(int n) {
        if(n <= 2) return n;
        // code here
        int a = 1; 
        int b = 1;
        int sum = 0;
        for(int i=1; i<n; i++){
            sum = a + b;
            
            a = b;
            b = sum;
        }
        
        return sum;
    }
}