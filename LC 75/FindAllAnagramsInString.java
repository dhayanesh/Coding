class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       Map <Character, Integer> hm1 = new HashMap<>();
       Map <Character, Integer> hm2 = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       int len1 = p.length();
       int len2 = s.length();
       int left = 0;
       if(len1 > len2)
        return list;
       for(int i = 0; i < len1; i++) {
           hm1.put(p.charAt(i), hm1.getOrDefault(p.charAt(i), 0) + 1);
           hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0) + 1);
       }

       if(hm1.equals(hm2))  
          list.add(0);
        
        for(int i = len1; i < len2; i++) {
            hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0) + 1);
            hm2.put(s.charAt(left), hm2.getOrDefault(s.charAt(left), 0) - 1);
            if(hm2.get(s.charAt(left)) == 0 || hm2.get(s.charAt(left)) == -1)
                hm2.remove(s.charAt(left));
            left++;
            if(hm1.equals(hm2))
                list.add(left);
        }

        return list;
    }
}
