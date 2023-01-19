class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(sArr[i])) {
                if(map.get(sArr[i]).equals(tArr[i]))
                    continue;
                else
                    return false;
            }
            else{
                if(!map.containsValue(tArr[i]))
                    map.put(sArr[i],tArr[i]);
                else
                    return false;          
            }
        }

        return true;

    }
}
