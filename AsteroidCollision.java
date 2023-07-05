class Solution {
    Stack<Integer> stack;
    public int[] asteroidCollision(int[] asteroids) {
        stack = new Stack<>();
        
        for(int i = 0; i < asteroids.length; i++) {
            if(stack.isEmpty())
                stack.push(asteroids[i]);
            else {
                if(stack.peek() * asteroids[i] < 0)
                    asteroidCrash(asteroids[i]);
                else
                    stack.push(asteroids[i]);
            }
        }

        int[] arr = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public void asteroidCrash(int top) {
        if(stack.isEmpty() || stack.peek() < 0) {
            stack.push(top);
            return;
        }

        if(Math.abs(stack.peek()) < Math.abs(top)) {
            stack.pop();
            asteroidCrash(top);
        } else if (Math.abs(stack.peek()) == Math.abs(top)) {
            stack.pop();
        }
    }
}
