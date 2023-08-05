class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            if(hm.get(ch) > (s.length() + 1) / 2)
                return "";
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (char ch: hm.keySet()) {
            maxHeap.add(ch);
        }

        while (maxHeap.size() > 1) {
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            
            sb.append(first);
            sb.append(second);
            
            hm.put(first, hm.get(first) - 1);
            hm.put(second, hm.get(second) - 1);
            
            if (hm.get(first) > 0) {
                maxHeap.add(first);
            }
            if (hm.get(second) > 0) {
                maxHeap.add(second);
            }
        }

        if (!maxHeap.isEmpty()) {
            sb.append(maxHeap.poll());
        }

        return sb.toString();
    }
}
