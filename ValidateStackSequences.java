class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length != popped.length)
            return false;

        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;

        while(i < pushed.length && j < popped.length) {
            stack.push(pushed[i]);
            i++;
            //Note: if comparsion with multiple arrays, nested while might needed
            while(!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}
