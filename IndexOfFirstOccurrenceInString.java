class Solution {
    public int strStr(String haystack, String needle) {
        int idx = 0;

        while(!haystack.equals("")) {
            if(haystack.startsWith(needle))
                return idx;
            else
                haystack = haystack.substring(1);
            idx++;
        }

        return -1;
    }
}
