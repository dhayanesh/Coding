class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int s1Arr[] = new int[26];
        int s2Arr[] = new int[26];
        int left = 0, right = s1.length();

        for(int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a'] += 1;
            s2Arr[s2.charAt(i) - 'a'] += 1;
        }

        if(Arrays.equals(s1Arr, s2Arr))
            return true;
        
        for(int i = right; i < s2.length(); i++) {
            s2Arr[s2.charAt(i) - 'a'] += 1;
            s2Arr[s2.charAt(left) - 'a'] -= 1;
            left++;
            if(Arrays.equals(s1Arr, s2Arr))
                return true;
        }

        return false;

    }
    
}
