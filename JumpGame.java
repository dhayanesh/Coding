class Solution {
    public boolean canJump(int[] nums) {
        int target = nums.length - 1;
        if(target == 0 && nums[0] >= 0)
            return true;
        for(int i = nums.length - 2; i >=0; i--) {
            if(i + nums[i] >= target)
                target = i;
        }
        if(target == 0)
            return true;
        return false;
    }
}
