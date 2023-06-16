class Solution {
    public Map<Character, String> map = new HashMap<>();
    
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        List<String> list = new ArrayList<>();
        if(digits.length() != 0) backtrack(list, "", digits, 0);
        return list;
    }
    
    private void backtrack(List<String> list, String str, String digits, int index) {
        if(str.length() == digits.length()) {
            list.add(str);
        } else {
            for(int i = 0; i < map.get(digits.charAt(index)).length(); i++) {
                str += map.get(digits.charAt(index)).charAt(i);
                backtrack(list, str, digits, index + 1);
                str = str.substring(0, str.length() - 1);
            }
        }
    }
}
