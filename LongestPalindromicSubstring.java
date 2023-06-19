class Solution {
    public String longestPalindrome(String s) {  
        if (s.length() == 1) {
            return s;
        }   

        String max = "";
        int len = s.length();

        for(int i = 0; i < len; i++) {
            //for odd lenght - 1, 3, 5...
            int left = i, right = i;
            while(left >= 0 && right <= len - 1 && s.charAt(left) == s.charAt(right)) {
                max = (max.length() > (s.substring(left, right+1)).length() )? max : s.substring(left, right+1);
                left--;
                right++;
            }

            //for even length - 2, 4, 6...
            left = i;
            right = i+1;
            while(left >= 0 && right <= len - 1 && s.charAt(left) == s.charAt(right)) {
                max = (max.length() > (s.substring(left, right+1)).length() )? max : s.substring(left, right+1);
                left--;
                right++;
            }
        }
        return max;
    }
}
