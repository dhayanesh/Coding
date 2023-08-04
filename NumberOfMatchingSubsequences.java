class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        Map<String, Integer> hm = new HashMap<>();

        for(String word: words)
            hm.put(word, hm.getOrDefault(word, 0) + 1);

        for(String word: hm.keySet()) {
            if(isSubsequences(s, word))
                count += hm.get(word);
        }
        return count;
    }

    public boolean isSubsequences(String s, String word) {
        int i = 0, j = 0;
        while(i < s.length() && j < word.length()) {
            if(s.charAt(i) == word.charAt(j)) {
                i++;
                j++;
            } else
                i++;
        }
        if(j == word.length())
            return true;
        else
            return false;
    }
}
