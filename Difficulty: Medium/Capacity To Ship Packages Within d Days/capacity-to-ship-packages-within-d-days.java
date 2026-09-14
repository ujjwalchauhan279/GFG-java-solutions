class Solution {
	public int ispossible(int capacity, ArrayList<Integer> arr) {
		int days = 0;
		int c = capacity;
		for (int i=0; i<arr.size(); i++) {
			c -= arr.get(i);
			if (c < 0) {
				days++;
				c = capacity - arr.get(i);
			}
		}
		
		days++;
		return days;
	}
	public int leastWeightCapacity(ArrayList<Integer> arr, int days) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int n = arr.size();
		
		for (int i=0; i<n; i++) {
			max = Math.max(max, arr.get(i));
			sum += arr.get(i);
		}
		
		int low = max;
		int high = sum;
		int ans = sum;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			if (ispossible(mid, arr) <= days) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return ans;
	}
}
