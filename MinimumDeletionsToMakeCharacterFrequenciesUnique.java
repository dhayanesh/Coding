import java.util.*;

class Solution {
    public int minDeletions(String s) {
        if(s == null || s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(char ch: s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0)+1);
        
        int counts = 0;
        for(int count: map.values()) {
            while(count > 0 && !set.add(count)) {
                count--;
                counts++;
            }
        }
        return counts;
    }
}
