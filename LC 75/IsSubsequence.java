class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 =s.length();
        int len2 = t.length();
        if(len1 > len2)
            return false;
        if(len1 == 0)
            return true;
        int i = 0, j = 0, count = 0;
        while(i < len1 && j < len2) {
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
                j++;
            }
            else
                j++;
        }
        if(count == len1)
            return true;
        else
            return false;
    }
}
