class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> subStr = new ArrayList<>();
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            if(subStr.contains(s.charAt(i))) {
                int pos = subStr.indexOf(s.charAt(i));
                    subStr.subList(0, pos+1).clear();
            }
            subStr.add(s.charAt(i));
            maxLen = Math.max(maxLen, subStr.size());
        }

        return maxLen;
        

    }
}
