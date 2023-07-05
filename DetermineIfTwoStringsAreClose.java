class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for(char ch: word1.toCharArray())
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);

        for(char ch: word2.toCharArray())
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);

        //***bookmarked problem to revise HashMap operations***

        if(!hm1.keySet().equals(hm2.keySet()))
            return false;

        List<Integer> values1 = new ArrayList<>(hm1.values());
        List<Integer> values2 = new ArrayList<>(hm2.values());
        
        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);    
    }
}
