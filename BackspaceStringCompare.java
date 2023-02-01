class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sk1 = new Stack<>();
        Stack<Character> sk2 = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '#' && !sk1.isEmpty())
                sk1.pop();
            if(ch != '#')
                sk1.push(ch);
        }
        for(char ch : t.toCharArray()) {
            if(ch == '#' && !sk2.isEmpty())
                sk2.pop();
            if(ch != '#')
                sk2.push(ch);
        }
        if(sk1.size() != sk2.size())
            return false;
        int len = sk1.size();
        for(int i = 0; i < len; i++) {
            if(sk1.pop() != sk2.pop())
                return false;
        } 
        return true;       
    }
}
