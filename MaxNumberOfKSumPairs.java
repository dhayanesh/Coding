class Solution {
    public int maxOperations(int[] nums, int k) {
        int maxOp = 0, left = 0, right = nums.length - 1;

        Arrays.sort(nums);
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                maxOp++;
                left++;
                right--;
            }
            if(sum < k)
                left++;
            if(sum > k)
                right--;
        }

        return maxOp;
    }
}
