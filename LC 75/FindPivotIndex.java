class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            right += nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            int temp= nums[i];
            right -= temp;

            if(left == right)
                return i;
            
            left += temp;
        }
        return -1;
    }
}
