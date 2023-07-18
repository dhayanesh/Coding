class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
            return "";
        
        Map<Character, Integer> s_hm = new HashMap<>();
        Map<Character, Integer> t_hm = new HashMap<>();

        for(char ch: t.toCharArray())
            t_hm.put(ch, t_hm.getOrDefault(ch, 0) + 1);
        
        int left = 0, right = 0, min = Integer.MAX_VALUE, count = 0;
        String res = "";
        while(right < s.length()) {
            char c = s.charAt(right);
            s_hm.put(c, s_hm.getOrDefault(c, 0) + 1);

            if (t_hm.containsKey(c) && s_hm.get(c).intValue() <= t_hm.get(c).intValue()) {
                count++;
            }
            
            while(count == t.length()) {
                if(min > right - left + 1) {
                    res = s.substring(left, right+1);
                    min = right - left + 1;
                }
                
                char leftChar = s.charAt(left);
                s_hm.put(leftChar, s_hm.get(leftChar) - 1);
                if(t_hm.containsKey(leftChar) && s_hm.get(leftChar).intValue() < t_hm.get(leftChar).intValue()) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return res;
    }
}
