class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int rob(int[] nums) {
        int n = nums.length-1;
        int minCost = computeMax(nums, n); 
        return minCost;       
        
    }
    public int computeMax(int[] cost, int n) {
        if(n < 0)
            return 0;
        if(dp.containsKey(n))
            return dp.get(n);
        int max = Math.max(computeMax(cost, n-1), computeMax(cost, n-2) + cost[n]);
        dp.put(n, max);
        return max;
    }

}
