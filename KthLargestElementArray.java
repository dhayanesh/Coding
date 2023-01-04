class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums) {
            if(pq.size() < k)
                pq.add(n);
            else if(pq.peek() < n) {
                pq.poll();
                pq.add(n);
            }
        }
        return pq.poll();
        

    }
}
