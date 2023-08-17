class Solution {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for(int num: arr) {
            addToQueue(num, k ,x);
        }

        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }

    public void addToQueue(int num, int k, int x) {
        int size = queue.size();
        if(size >= k) {
            if(Math.abs(queue.peek() - x) > Math.abs(num - x)) {
                queue.poll();
                queue.offer(num);
            }
        } else {
            queue.offer(num);
        }
    }
}
