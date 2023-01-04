class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mh = new PriorityQueue();
        for(int stone : stones) 
            mh.add(-stone);

        while(mh.size() > 1) {
            int st1 = -mh.poll();
            int st2 = -mh.poll();
            int newSt = st1 - st2;
            if(st1 != st2)
                mh.add(-newSt);
        }

        if(mh.size() == 0)
            return 0;
        else
            return -mh.remove();

    }
}
