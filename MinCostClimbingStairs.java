class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int minCost = Math.min(computeMin(cost, n-1), computeMin(cost, n-2)); 
        return minCost;       
    }

    public int computeMin(int[] cost, int n) {
        if(n < 0)
            return 0;
        if(n == 0 || n == 1)
            return cost[n];
        if(dp.containsKey(n))
            return dp.get(n);
        int min = cost[n] + Math.min(computeMin(cost, n-1), computeMin(cost, n-2));
        dp.put(n, min);
        return min;

    }
}
