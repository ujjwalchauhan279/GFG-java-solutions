class Solution {
    public int[] singleNum(int[] nums) {
        // Code here
        int ans[] = new int[2];
        int XOR = 0;

        for(int ele: nums) XOR ^= ele;

        int k = 0;
        while(XOR != 0){
            if((XOR & 1) == 1){
                break;
            }
            k++;
            XOR >>= 1;
        }

        int xor1 = 0;
        int xor2 = 0;

        for(int ele: nums){
            if((ele & (1 << k)) == 0) xor1 ^= ele;
            else xor2 ^= ele;
        }
        
        if(xor1 < xor2){
            ans[0] = xor1;
            ans[1] = xor2;
        }
        else{
            ans[0] = xor2;
            ans[1] = xor1;
        }
        
        return ans;
    }
}