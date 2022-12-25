/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/



class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return false;
        List<Character> ch = new ArrayList<>();
        String lwr = s.toLowerCase();
        for(char i : lwr.toCharArray()){
            if((i >= 'a' && i <='z') || (i >= '0' && i <='9'))
                ch.add(i);
        }

        for(int i = 0; i < ch.size() / 2; i++) {
            if(ch.get(i) != ch.get(ch.size()-1-i))
                return false;
        }

        return true;


    }
}
