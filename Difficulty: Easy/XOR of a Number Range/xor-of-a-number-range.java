class Solution {
    public static int XOR(int n){
        int x = n % 4;
        
        if(x == 0) return n;
        else if(x == 1) return 1; 
        else if(x == 2) return n+1;
        else return 0;
    }
    public static int findXOR(int l, int r) {
        return XOR(l-1) ^ XOR(r);
    }
}