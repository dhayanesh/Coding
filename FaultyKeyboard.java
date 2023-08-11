class Solution {
    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'i')
                result.reverse();
            else
                result.append(s.charAt(i));
        }
        return result.toString();
    }
}
