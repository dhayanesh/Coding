class Solution {
    public int longestPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for(Character c : s.toCharArray()) {
            if(list.contains(c)) {
                count++;
                list.remove(c);
            }
            else
                list.add(c);
        }
        if(list.size() != 0)
            return count * 2 + 1;
        else
            return count * 2; 
    }
}
