class Solution {
    public String removeStars(String s) {
        Stack<Character> sk  = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '*')
                sk.pop();
            else
                sk.push(ch);
        }
        StringBuilder sb= new StringBuilder();
        while(!sk.isEmpty()) {
            sb.append(sk.pop());
        }
        return sb.reverse().toString();
    }
}
