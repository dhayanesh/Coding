//similar to fibonacci with memoization.
class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(dp.containsKey(n))
            return dp.get(n);
        int count = climbStairs(n-1) + climbStairs(n-2);
        dp.put(n, count);
        return count;
    }
}
