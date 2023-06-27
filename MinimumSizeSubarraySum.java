class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, count = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                count = Math.min(count, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(count != Integer.MAX_VALUE)
            return count;
        else
            return 0;
    }
}
