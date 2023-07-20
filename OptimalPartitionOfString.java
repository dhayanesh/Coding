class Solution {
    public int partitionString(String s) {
        int count = 0;
        HashMap <Character, Integer> hm = new HashMap<>();

        for(char ch: s.toCharArray()) {
            if(hm.containsKey(ch)) {
                count++;
                hm.clear();
            }
            hm.put(ch, 1);
        }
        return count+1;
    }
}
