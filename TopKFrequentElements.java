class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getValue));

        for (Map.Entry<Integer, Integer> set : count.entrySet()) {
            pq.add(new Pair<>(set.getKey(), set.getValue()));
            if(pq.size() > k)
                pq.poll();
        }

        int[] arr = new int[k];
        int i = 0;
        while(!pq.isEmpty())
            arr[i++] = pq.poll().getKey();
          
        return arr;
    }
}
