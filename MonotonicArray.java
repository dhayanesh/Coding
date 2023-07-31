class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > prev)
                inc = false;
            if(nums[i] < prev)
                dec = false;
            prev = nums[i];
        }
        return inc || dec;
    }
}
