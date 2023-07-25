class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right = k;
        double sum = 0, max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++)
            sum += nums[i];
        max = Math.max(sum / k, max);
        
        while(right < nums.length) {
            sum -= nums[left];
            sum += nums[right];
            max = Math.max(sum / k, max);
            left++;
            right++;
        }

        return max;
    }
}
