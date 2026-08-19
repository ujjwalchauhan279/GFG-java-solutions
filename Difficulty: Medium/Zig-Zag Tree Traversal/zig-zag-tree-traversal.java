class Solution {
	ArrayList<Integer> zigZagTraversal(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		boolean leftToRight = true;
		
		while (q.size() != 0) {
			int size = q.size();
			for (int i = 0; i<size; i++) {
				Node front = q.remove();
				if(leftToRight) list.add(front.data);
				else list.add(list.size() - i, front.data);
				
				
				if (front.left != null)
					q.add(front.left);
				if (front.right != null)
					q.add(front.right);
				
			}
			leftToRight = !leftToRight;
			
		}
		
		return list;
	}
}
