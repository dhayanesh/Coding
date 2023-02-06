class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char ch : order.toCharArray()) {
            map.put(ch, count);
            count++;
        }

        for(int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];
            int large = prev.length() > curr.length() ? prev.length() : curr.length();
            int small = prev.length() > curr.length() ? curr.length() : prev.length();
            for(int j = 0; j < large; j ++) {
                if(j == small && curr.length() == j)
                    return false;
                else if(j == small && prev.length() == j)
                    break;
                else if(map.get(prev.charAt(j)) > map.get(curr.charAt(j)))
                    return false;
                else if(map.get(prev.charAt(j)) == map.get(curr.charAt(j)))
                    continue;
                else
                    break;
            }
        }
        return true;
    }
}
