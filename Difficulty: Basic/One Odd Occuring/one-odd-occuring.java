class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int ans = 0;
        for(int ele: arr){
            ans ^= ele;
        }
        
        return ans;
    }
}