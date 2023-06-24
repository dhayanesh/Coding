class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap <Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), i);
        }

        List <Integer> list = new ArrayList<>();
        int end = 0, size = 0;

        for(int i = 0; i < s.length(); i++) {
            size += 1;
            int lastPos = hm.get(s.charAt(i));

            if(end < lastPos)
                end = lastPos;
            
            if(i == end) {
                list.add(size);
                size = 0;
            }
        }
        return list;
    }
} 
