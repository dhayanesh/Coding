class Solution {
    public boolean checkValidString(String s) {
        Stack <Integer> brackets = new Stack<>();
        Stack <Integer> stars = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') 
                brackets.push(i);
            else if(ch == ')') {
                if(!brackets.isEmpty())
                    brackets.pop();
                else if(!stars.isEmpty())
                    stars.pop();
                else
                    return false;
            }
            else
                stars.push(i);
        }

        //to handle more '(' than ')' with having additional '*'
        //this is why position is stored instead of characters
        while (!stars.isEmpty() && !brackets.isEmpty()){
            if (stars.peek() < brackets.peek())
                return false;
            stars.pop();
            brackets.pop();
        }

        return brackets.isEmpty();
    }
}
