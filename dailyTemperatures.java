class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++)
            temps[i] = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            while( !stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                temps[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return temps;

    }
}
