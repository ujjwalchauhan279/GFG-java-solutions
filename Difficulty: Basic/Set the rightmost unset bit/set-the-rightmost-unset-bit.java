class Solution {
    public int setBit(int n) {
        // code here
        int idx = 0;
        int x = n;
        while(x != 0){
            int rightBit = (x & 1);
            if(rightBit == 0){
                break;
            }
            idx++;
            x = x >> 1;
        }
        
        return (n | (1 << idx));
        
    }
}