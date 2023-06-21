import java.util.*;

class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict);
    }

    public boolean dfs(String s, List<String> wordDict) {
        if(s.length() == 0) {
            return true;
        }
        if(memo.containsKey(s)) {
            return memo.get(s);
        }
        for(String word : wordDict) {
            if(s.startsWith(word)) {
                if(dfs(s.substring(word.length()), wordDict)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }
}
