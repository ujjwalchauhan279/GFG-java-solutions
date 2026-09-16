class Solution {
    public int ispossible(int dist, int arr[]){
        int last = arr[0];
        int countCow = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] - last >= dist){
                countCow++;
                last = arr[i];
            }
        }
        
        return countCow;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int val = arr[n-1] - arr[0];
        
        for(int i=1; i<=val; i++){
            if(ispossible(i, arr) >= k){
                continue;
            }
            else {
                return (i-1);
            }
        }
        
        return val;
    }
}