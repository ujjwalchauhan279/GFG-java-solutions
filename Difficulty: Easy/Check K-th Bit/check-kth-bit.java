class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        n = n >> k;
        if((1 & n) == 1) return true;
        return false;
    }
}