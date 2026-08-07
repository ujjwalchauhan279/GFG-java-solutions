class Solution {
	public ArrayList<Double> getMedian(int[] arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Double> list = new ArrayList<>();
		// code here
		for (int num: arr) {
			if (maxHeap.size() == 0) maxHeap.add(num); // Both heap empty
			else {
				if (num < maxHeap.peek())
					maxHeap.add(num);
				else
					minHeap.add(num);
			}
			
			if (maxHeap.size() == minHeap.size() + 2) {
				minHeap.add(maxHeap.remove());
			}
			if (minHeap.size() == maxHeap.size() + 2) {
				maxHeap.add(minHeap.remove());
			}
			
			
			if (maxHeap.size() == minHeap.size() + 1) {
				list.add((double)maxHeap.peek());
			}
			else if (minHeap.size() == maxHeap.size() + 1) {
				list.add((double)minHeap.peek());
			}
			else {
				list.add((minHeap.peek() + maxHeap.peek())/2.0);
			}
		}
		
		
		return list;
	}
}
