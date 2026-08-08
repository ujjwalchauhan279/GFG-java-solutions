class Solution {
    public boolean isPowerOfTwo(int n){
        return (n > 0) && ((n & (n-1)) == 0);
    }
    public boolean isSquareRoot(int n){
        double x = Math.sqrt(n);
        return ((x * x) == n);
    }
    boolean isPowerOfFour(int n) {
        // code here
        return isPowerOfTwo(n) && isSquareRoot(n);
    }
}