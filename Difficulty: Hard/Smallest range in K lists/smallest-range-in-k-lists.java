class Triplet implements Comparable<Triplet>{
    int ele;
    int row;
    int col;
    
    Triplet(){}
    Triplet(int ele, int row, int col){
        this.ele = ele;
        this.row = row;
        this.col = col;
    }
    
    public int compareTo(Triplet t){
        return this.ele - t.ele;
    }
}


class Solution {
    public ArrayList<Integer> findSmallestRange(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = mat.length;
        int n = mat[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<k; i++){
            max = Math.max(max, mat[i][0]);
            min = Math.min(min, mat[i][0]);
            pq.add(new Triplet(mat[i][0], i, 0));
        }
        
        int ele = 0;
        int row = 0;
        int col = 0;
        
        int a = min;
        int b = max;
        Triplet top;
        
        while(true){
            top = pq.remove();
            ele = top.ele;
            row = top.row;
            col = top.col;
            
            if(max - ele < b - a){
                b = max;
                a = ele;
            }
            
            if(col == n-1) break;
            
            int next = mat[row][col+1];
            max = Math.max(max, next);
            
            pq.add(new Triplet(next, row, col+1));
        }
        
        ans.add(a);
        ans.add(b);
        
        return ans;
        
    }
}