class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(String str : strs) {
            while(str.indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
