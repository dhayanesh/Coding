class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        int i = 0;

        if(pattern.length() != arr.length)
            return false;

        for(char ch : pattern.toCharArray()) {
            if(map.containsKey(ch)) {
                if (!map.get(ch).equals(arr[i]))
                    return false;
            }
            else {
                if (map.containsValue(arr[i]))
                    return false;
                map.put(ch, arr[i]);
            }
            i++;
        }
        return true;
    }
}
