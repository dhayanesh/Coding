class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE, curMax = 0;

        int minSum = Integer.MAX_VALUE, curMin = 0;

        int totalSum = 0;
        for(int n : nums) {
            //max sum - normal Kadanae
            curMax = curMax + n;
            if(curMax < n)
                curMax = n;
            if(curMax > maxSum)
                maxSum = curMax;

            //min sum - if we find min sum sub-array, we can deduct it from total sum to get circular max sum
            curMin = curMin + n;
            if(curMin > n)
                curMin = n;
            if(curMin < minSum)
                minSum = curMin;

            totalSum += n;
        }

        //if all are negative, then maximum element
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
