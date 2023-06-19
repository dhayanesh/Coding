class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int count = 0;

        if(len == 0 || len == 1)
            return len;

        for(int i = 0; i < len; i++) {
            //for odd lenght - 1, 3, 5...
            int left = i, right = i;
            while(left >= 0 && right <= len - 1 && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }

            //for even length - 2, 4, 6...
            left = i;
            right = i+1;
            while(left >= 0 && right <= len - 1 && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
