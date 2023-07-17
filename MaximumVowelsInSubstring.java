class Solution {
    public int maxVowels(String s, int k) {
        HashMap <Character, Integer> hm = new HashMap<>();
        hm.put('a', 0);
        hm.put('e', 0);
        hm.put('i', 0);
        hm.put('o', 0);
        hm.put('u', 0);
        int left = 0, res = 0; 
        for(int right = 0; right < s.length(); right++) {
            if(right - left + 1 > k) {
                if(hm.containsKey(s.charAt(left))) {
                    hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
                }
                left++;
            }
            if(hm.containsKey(s.charAt(right))) {
                hm.put(s.charAt(right), hm.get(s.charAt(right)) + 1);
                int sum = 0;
                for (Map.Entry<Character, Integer> entry : hm.entrySet()) 
                    sum += entry.getValue();
                
                res = Math.max(res, sum);

            }
        }

        return res;
    }
}
