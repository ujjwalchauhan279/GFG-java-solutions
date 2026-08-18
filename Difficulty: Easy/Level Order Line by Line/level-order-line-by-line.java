class Pair{
    Node r;
    int level;

    Pair(Node r, int level){
        this.r = r;
        this.level = level;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,1));
        int currLevel = 1;

        while(q.size() > 0){
            Pair front = q.remove();

            // if level is same
            if(currLevel == front.level){
                innerList.add(front.r.data);
            }
            /* if level changes then store innerlist in outerlist
            and innerlist ko new list sa point kr diya, currlevel also increase*/
            else{
                list.add(innerList);
                innerList = new ArrayList<>();
                innerList.add(front.r.data);
                currLevel++;
            }

            // queue mai left right child insert kr diya
            if(front.r.left != null) q.add(new Pair(front.r.left, front.level+1));
            if(front.r.right != null) q.add(new Pair(front.r.right, front.level+1));
        }

        list.add(innerList);
        return list;
        
    }
}