class Solution {
    public String frequencySort(String s) {
        if(s.equals(""))
            return "";
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray())
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (char ch: hm.keySet()) {
            maxHeap.add(ch);
        }
        
        while (maxHeap.size() > 0) {
            char ch = maxHeap.poll();

            for(int i = 0; i < hm.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
