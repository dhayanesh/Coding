class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(token.equals( "+")) 
                stack.push(stack.pop() + stack.pop());
            else if(token.equals( "-")) {
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j - i);
            }
            else if(token.equals( "*")) 
                stack.push(stack.pop() * stack.pop()); 
            else if(token.equals( "/")) {
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j / i);
            }
            else 
                stack.push(Integer.parseInt(token));

        }
        return stack.pop();

    }
}
