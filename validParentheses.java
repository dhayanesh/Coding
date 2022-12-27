/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
String is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/

class Solution {
    public boolean isValid(String s) {
        Stack <Character> sk = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                sk.push(s.charAt(i));
            }
            else if(sk.empty()) return false;
            else if ((s.charAt(i) == ')' && sk.peek() == '(') || 
            (s.charAt(i) == ']' && sk.peek() == '[') || 
            (s.charAt(i) == '}' && sk.peek() == '{')) {
                sk.pop();
            }
            else
                return false;
        }
        if(!sk.empty()) return false;
        return true;

    }
}
